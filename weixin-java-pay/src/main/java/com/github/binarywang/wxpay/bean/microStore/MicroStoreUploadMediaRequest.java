package com.github.binarywang.wxpay.bean.microStore;

import com.github.binarywang.wxpay.bean.request.BaseWxPayRequest;
import com.github.binarywang.wxpay.exception.WxPayException;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(builderMethodName = "newBuilder")
@NoArgsConstructor
@AllArgsConstructor
@XStreamAlias("xml")
public class MicroStoreUploadMediaRequest extends BaseWxPayRequest {

  @XStreamAlias("mch_id")
  private String mchId;

  @XStreamAlias("media_hash")
  private String mediaHash;

  @Override
  protected void checkConstraints() throws WxPayException {

  }
}
