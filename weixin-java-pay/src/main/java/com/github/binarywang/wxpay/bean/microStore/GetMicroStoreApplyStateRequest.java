package com.github.binarywang.wxpay.bean.microStore;

import com.github.binarywang.wxpay.bean.request.BaseWxPayRequest;
import com.github.binarywang.wxpay.exception.WxPayException;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

/**
 * @author feiyan
 * @date 2019/10/15 23:36
 */
@Data
public class GetMicroStoreApplyStateRequest extends BaseWxPayRequest {

  /**
   * 必填，接口版本号，默认值1.0
   */
  @XStreamAlias("version")
  private String version = "1.0";

  /**
   * 商户号，服务商的商户号
   */
  @XStreamAlias("mch_id")
  private String mchId;

  /**
   * 微信支付分配的申请单号。applyment_id、business_code两者不能同时为空。
   */
  @XStreamAlias("applyment_id")
  private String applymentId;

  /**
   * 服务商自定义的商户唯一编号。当applyment_id已填写时，此字段无效。
   */
  @XStreamAlias("business_code")
  private String businessCode;

  /**
   * 必填，随机字符串
   */
  @XStreamAlias("nonce_str")
  private String nonceStr;

  /**
   * 必填，签名类型
   * 仅支持HMAC-SHA256
   */
  @XStreamAlias("sign_type")
  private String signType;

  /**
   * 必填，签名
   */
  @XStreamAlias("sign")
  private String sign;

  @Override
  protected void checkConstraints() throws WxPayException {

  }
}
