package com.github.binarywang.wxpay.bean.result;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

@Data
@XStreamAlias("xml")
public class MicroStoreUploadMediaResult extends BaseWxPayResult {

  @XStreamAlias("err_code_des")
  private String errCodeDes;

  @XStreamAlias("media_id")
  private String mediaId;

}
