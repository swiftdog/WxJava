package com.github.binarywang.wxpay.bean.result;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

/**
 * Created by : yanfei
 * Created time : 2019-11-30 22:07
 */
@Data
@XStreamAlias("xml")
public class MicroStoreQueryAutoWithdrawResult extends BaseWxPayResult {


  /**
   * 签名类型
   */
  @XStreamAlias("sign_type")
  private String signType;

  /**
   * 日期
   */
  @XStreamAlias("date")
  private String date;

  /**
   * 商户号
   */
  @XStreamAlias("mch_id")
  private String mchId;

  /**
   * 小微商户号
   */
  @XStreamAlias("sub_mch_id")
  private String subMchId;

  /**
   * 单据状态
   */
  @XStreamAlias("withdraw_status")
  private String withdrawStatus;

  /**
   * 单据失败原因
   */
  @XStreamAlias("fail_reason")
  private String failReason;

  /**
   * 提现单单据ID
   */
  @XStreamAlias("withdraw_id")
  private String withdrawId;

  /**
   * 提现金额，单位：分
   */
  @XStreamAlias("amount")
  private Integer amount;

  /**
   * 单据创建时间，时间格式为YYYY-MM-dd HH:mm:ss
   */
  @XStreamAlias("create_time")
  private String createTime;

  /**
   * 单据成功时间，时间格式为YYYY-MM-dd HH:mm:ss
   */
  @XStreamAlias("success_time")
  private String successTime;

  /**
   * 单据退票时间，时间格式为YYYY-MM-dd HH:mm:ss
   */
  @XStreamAlias("refund_time")
  private String refundTime;

}
