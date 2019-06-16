package com.github.binarywang.wxpay.bean.result;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

/**
 * Created by : yanfei
 * Created time : 19/5/6 下午11:15
 */
@Data
@XStreamAlias("xml")
public class MicroStoreApplySettleInResult extends BaseWxPayResult {

  @XStreamAlias("err_param")
  private String errParam;

  @XStreamAlias("applyment_id")
  private String applymentId;

}
