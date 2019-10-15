package com.github.binarywang.wxpay.bean.result;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author feiyan
 * @date 2019/10/15 23:44
 */
@Data
@XStreamAlias("xml")
public class GetMicroStoreApplyStateResult extends BaseWxPayResult {

  /**
   * 微信支付分配的申请单号
   */
  @XStreamAlias("applyment_id")
  private String applymentId;

  /**
   * 申请状态
   *
   * AUDITING:审核中
   *
   * REJECTED:已驳回
   *
   * FROZEN:已冻结
   *
   * TO_BE_SIGNED:待签约
   *
   * FINISH:完成
   */
  @XStreamAlias("applyment_state")
  private String applymentState;

  /**
   * 申请状态描述
   */
  @XStreamAlias("applyment_state_desc")
  private String applymentStateDesc;

  /**
   * 小微商户号，当申请状态为TO_BE_SIGNED或FINISH时才返回
   */
  @XStreamAlias("sub_mch_id")
  private String subMchId;

  /**
   * 签约链接，当申请状态为TO_BE_SIGNED或FINISH时才返回
   */
  @XStreamAlias("sign_url")
  private String signUrl;

  /**
   * 审核详情，各项被驳回资料的驳回理由。当申请状态为REJECTED时才返回。字段值为json格式
   */
  @XStreamAlias("audit_detail")
  private String auditDetail;

  /**
   * auditDetail字符串转化为对象
   */
  private List<Map<String,String>> auditDetails;

}
