package com.github.binarywang.wxpay.config;

import com.github.binarywang.wxpay.bean.microStore.MicroStoreUploadMediaRequest;
import com.github.binarywang.wxpay.bean.result.ApiCertificateInfoBo;
import com.github.binarywang.wxpay.bean.result.MicroStoreUploadMediaResult;
import com.github.binarywang.wxpay.exception.WxPayException;
import com.github.binarywang.wxpay.service.WxPayService;
import com.github.binarywang.wxpay.service.impl.WxPayServiceImpl;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import static org.testng.Assert.*;

/**
 * <pre>
 *  Created by BinaryWang on 2017/6/18.
 * </pre>
 *
 * @author <a href="https://github.com/binarywang">Binary Wang</a>
 */
public class WxPayConfigTest {
  private WxPayConfig payConfig = new WxPayConfig();

  /**
   * Test init ssl context.
   *
   * @throws Exception the exception
   */
  @Test
  public void testInitSSLContext() throws Exception {
    payConfig.setMchId("123");
    payConfig.setKeyPath("classpath:/abc.p12");
    payConfig.initSSLContext();
  }

  @Test
  public void testDownloadApiCertificate() throws Exception{
    payConfig.setMchId("");
    payConfig.setMchKey("");
    payConfig.setApiV3Key("");
    WxPayService wxPayService = new WxPayServiceImpl();
    wxPayService.setConfig(payConfig);
    ApiCertificateInfoBo result = wxPayService.downloadApiCertificates();
    System.out.println(result);
  }

  @Test
  public void testUploadImage() throws IOException, WxPayException {
    payConfig.setMchId("");
    payConfig.setMchKey("");
    payConfig.setApiV3Key("");
    payConfig.setKeyPath("");

    WxPayService wxPayService = new WxPayServiceImpl();
    wxPayService.setConfig(payConfig);
    MicroStoreUploadMediaRequest request = new MicroStoreUploadMediaRequest();
    File file = new File("D:\\a.jpg");
    request.setFile(file);
    MicroStoreUploadMediaResult result = wxPayService.microStoreUploadMedia(request);
    System.out.println(result);
  }

}
