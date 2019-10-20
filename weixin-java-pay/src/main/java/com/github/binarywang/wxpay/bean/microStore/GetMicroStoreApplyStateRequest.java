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
   * 微信支付分配的申请单号。applyment_id、business_code两者不能同时为空。
   */
  @XStreamAlias("applyment_id")
  private String applymentId;

  /**
   * 服务商自定义的商户唯一编号。当applyment_id已填写时，此字段无效。
   */
  @XStreamAlias("business_code")
  private String businessCode;


  @Override
  protected void checkConstraints() throws WxPayException {

  }
}
