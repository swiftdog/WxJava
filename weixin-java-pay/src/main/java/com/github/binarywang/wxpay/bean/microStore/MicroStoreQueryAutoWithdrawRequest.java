package com.github.binarywang.wxpay.bean.microStore;

import com.github.binarywang.wxpay.bean.request.BaseWxPayRequest;
import com.github.binarywang.wxpay.exception.WxPayException;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

/**
 * Created by : yanfei
 * Created time : 2019-11-30 22:21
 */
@Data
@XStreamAlias("xml")
public class MicroStoreQueryAutoWithdrawRequest extends BaseWxPayRequest {

  /**
   * 要查询的提现单据的日期
   * 注意自动提现单是在交易次日汇总前一天的结算结果后生成，所以如果自动提现单日期是20180602，则对应的是20180601这天的交易。目前只支持查询最近30天的自动提现
   * 格式：YYYYMMDD
   */
  @XStreamAlias("date")
  private String date;


  @Override
  protected void checkConstraints() throws WxPayException {

  }

}
