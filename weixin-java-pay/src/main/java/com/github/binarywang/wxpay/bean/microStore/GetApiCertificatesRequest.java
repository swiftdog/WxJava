package com.github.binarywang.wxpay.bean.microStore;

import com.github.binarywang.wxpay.bean.request.BaseWxPayRequest;
import com.github.binarywang.wxpay.exception.WxPayException;

/**
 * Created by : yanfei
 * Created time : 19/4/13 下午11:43
 */
public class GetApiCertificatesRequest extends BaseWxPayRequest {

  @Override
  protected void checkConstraints() throws WxPayException {
    //do nothing
  }
}
