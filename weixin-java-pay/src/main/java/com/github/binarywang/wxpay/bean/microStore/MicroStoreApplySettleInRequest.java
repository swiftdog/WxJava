package com.github.binarywang.wxpay.bean.microStore;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.*;

import java.util.List;

/**
 * Created by : yanfei
 * Created time : 19/4/13 下午9:11
 * 申请入驻
 */
@Data
@Builder(builderMethodName = "newBuilder")
@NoArgsConstructor
@AllArgsConstructor
@XStreamAlias("xml")
public class MicroStoreApplySettleInRequest {

  /**
   * 必填，接口版本号，固定版本号为3.0
   */
  @XStreamAlias("version")
  private String version = "3.0";

  /**
   * 必填，平台证书序列号
   */
  @XStreamAlias("cert_sn")
  private String certSn;

  /**
   * 必填，服务商商户号
   */
  @XStreamAlias("mch_id")
  private String mchId;

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

  /**
   * 必填，业务申请编号
   */
  @XStreamAlias("business_code")
  private String businessCode;

  /**
   * 必填，身份证人像面照
   * 请填写由图片上传接口预先上传图片生成好的media_id
   */
  @XStreamAlias("id_card_copy")
  private String idCardCopy;

  /**
   * 必填，身份证国徽面照
   * 请填写由图片上传接口预先上传图片生成好的media_id
   */
  @XStreamAlias("id_card_national")
  private String idCardNational;

  /**
   * 必填，身份证姓名
   * 该字段需进行加密处理
   */
  @XStreamAlias("id_card_name")
  private String idCardName;

  /**
   * 必填，身份证号码
   * 该字段需进行加密处理
   */
  @XStreamAlias("id_card_number")
  private String idCardNumber;

  /**
   * 必填，身份证有效期
   */
  @XStreamAlias("id_card_valid_time")
  private String idCardValidTime;

  /**
   * 必填，开户名称
   * 必须与身份证姓名一致，该字段需进行加密处理
   */
  @XStreamAlias("account_name")
  private String accountName;

  /**
   * 必填，开户银行
   */
  @XStreamAlias("account_bank")
  private String accountBank;

  /**
   * 必填，开户银行省市编码，至少精确到市
   */
  @XStreamAlias("bank_address_code")
  private String bandAddressCode;

  /**
   * 开户银行全称（含支行），17家直连银行无需填写，其他银行需要填写全称
   */
  @XStreamAlias("bank_name")
  private String bankName;

  /**
   * 必填，银行账号
   */
  @XStreamAlias("account_number")
  private String accountNumber;

  /**
   * 必填，门店名称
   * 最长50个中文字符
   */
  @XStreamAlias("store_name")
  private String storeName;

  /**
   * 必填，门店省市编码
   */
  @XStreamAlias("store_address_code")
  private String storeAddressCode;

  /**
   * 必填，门店街道名称
   * 具体区/县及街道门牌号或大厦楼层，最长500个中文字符（无需填写省市信息）
   */
  @XStreamAlias("store_street")
  private String storeStreet;

  /**
   * 非必填，门店经度
   */
  @XStreamAlias("store_longitude")
  private Long storeLongitude;

  /**
   * 非必填，门店纬度
   */
  @XStreamAlias("store_latitude")
  private Long storeLatitude;

  /**
   * 必填，门店门口照片
   */
  @XStreamAlias("store_entrance_pic")
  private String storeEntrancePic;

  /**
   * 必填，店内环境照片
   */
  @XStreamAlias("indoor_pic")
  private String indoorPic;

  /**
   * 非必填，经营场地证明
   */
  @XStreamAlias("address_certification")
  private String addressCertification;

  /**
   * 必填，商户简称
   */
  @XStreamAlias("merchant_shortname")
  private String merchantShortName;

  /**
   * 必填，客服电话
   */
  @XStreamAlias("service_phone")
  private String servicePhone;

  /**
   * 必填，售卖商品/提供服务描述
   * 请填写以下描述之一：餐饮,线下零售,居民生活服务,休闲娱乐,交通出行,其他
   */
  @XStreamAlias("product_desc")
  private String productDesc;

  /**
   * 必填，费率
   * 由服务商指定，微信支付提供字典值
   */
  @XStreamAlias("rate")
  private Double rate;

  /**
   * 非必填，补充说明
   */
  @XStreamAlias("business_addition_desc")
  private String businessAdditionDesc;

  /**
   * 非必填，补充材料
   */
  @XStreamAlias("business_addition_pics")
  private List<String> businessAdditionPics;

  /**
   * 必填，联系人姓名，和身份证姓名一致
   * 该字段需进行加密处理
   */
  @XStreamAlias("contact")
  private String contact;

  /**
   * 必填，手机号码
   * 需进行加密处理
   */
  @XStreamAlias("contact_phone")
  private String contactPhone;

  /**
   * 非必填，联系邮箱
   * 需进行加密处理
   */
  @XStreamAlias("contact_email")
  private String contactEmail;

}
