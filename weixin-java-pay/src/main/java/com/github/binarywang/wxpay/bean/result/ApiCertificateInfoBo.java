package com.github.binarywang.wxpay.bean.result;

import lombok.Data;

/**
 * Created by : yanfei
 * Created time : 19/4/14 上午1:05
 */
@Data
public class ApiCertificateInfoBo {


  private String serialNo;

  private String effectiveTime;

  private String expireTime;

  private String certificateContent;

}
