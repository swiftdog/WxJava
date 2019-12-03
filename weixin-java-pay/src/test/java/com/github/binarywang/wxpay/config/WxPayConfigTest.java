package com.github.binarywang.wxpay.config;

import com.github.binarywang.wxpay.bean.microStore.GetMicroStoreApplyStateRequest;
import com.github.binarywang.wxpay.bean.microStore.MicroStoreQueryAutoWithdrawRequest;
import com.github.binarywang.wxpay.bean.microStore.MicroStoreUploadMediaRequest;
import com.github.binarywang.wxpay.bean.request.BaseWxPayRequest;
import com.github.binarywang.wxpay.bean.request.WxPayUnifiedOrderRequest;
import com.github.binarywang.wxpay.bean.result.*;
import com.github.binarywang.wxpay.exception.WxPayException;
import com.github.binarywang.wxpay.service.WxPayService;
import com.github.binarywang.wxpay.service.impl.WxPayServiceImpl;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

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
    File file = new File("/Users/yanfei/Pictures/a.png");
    InputStream is = new FileInputStream(file);
    byte[] byt = new byte[is.available()];
    is.read(byt);
    request.setFileBytes(byt);
    MicroStoreUploadMediaResult result = wxPayService.microStoreUploadMedia(request);
    System.out.println(result);
  }

  @Test
  public void testGetMicroStoreApplyState() throws Exception {
    payConfig.setMchId("");
    payConfig.setMchKey("");
    payConfig.setApiV3Key("");
    payConfig.setKeyPath("");
    payConfig.setPlatformCertSn("");
    payConfig.setPlatformCertPath("");

    WxPayService wxPayService = new WxPayServiceImpl();
    wxPayService.setConfig(payConfig);
    GetMicroStoreApplyStateRequest request = new GetMicroStoreApplyStateRequest();
    request.setApplymentId("2000002130052446");
    GetMicroStoreApplyStateResult result = wxPayService.getMicroStoreApplyState(request);
    System.out.println(result);
  }

  @Test
  public void testMicroStoreQueryAutoWithdraw() throws Exception{
    payConfig.setMchId("");
    payConfig.setMchKey("");
    payConfig.setApiV3Key("");
    payConfig.setKeyPath("");
    payConfig.setPlatformCertSn("");
    payConfig.setPlatformCertPath("");
    WxPayService wxPayService = new WxPayServiceImpl();
    wxPayService.setConfig(payConfig);
    MicroStoreQueryAutoWithdrawRequest request = new MicroStoreQueryAutoWithdrawRequest();
    request.setSubMchId("1560199311");
    request.setDate("20191203");
    MicroStoreQueryAutoWithdrawResult result = wxPayService.microStoreQueryAutoWithdraw(request);
    System.out.println(result);
  }

  @Test
  public void testUnifiedOrder() throws Exception{
    payConfig.setMchId("");
    payConfig.setMchKey("");
    payConfig.setApiV3Key("");
    payConfig.setKeyPath("");
    payConfig.setPlatformCertSn("");
    payConfig.setPlatformCertPath("");

    WxPayService wxPayService = new WxPayServiceImpl();
    wxPayService.setConfig(payConfig);
    WxPayUnifiedOrderRequest request = new WxPayUnifiedOrderRequest();
    request.setAppid("");
    request.setSubAppId("");
    request.setMchId("");
    request.setSubMchId("");
    request.setBody("小星文具店-会员卡充值");
    request.setOutTradeNo("201910260001");
    request.setTotalFee(50);
    request.setSpbillCreateIp("");
    request.setNotifyUrl("");
    request.setTradeType("JSAPI");
    request.setSubOpenid("");
    WxPayUnifiedOrderResult result = wxPayService.unifiedOrder(request);
    System.out.println(result);
  }

}
