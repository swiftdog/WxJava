package com.github.binarywang.wxpay.bean.result;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

/**
 * Created by : yanfei
 * Created time : 19/4/14 上午12:52
 */
@Data
@XStreamAlias("xml")
public class WxPayApiCertificateResult extends BaseWxPayResult {

  @XStreamAlias("certificates")
  private String certificates;

}
