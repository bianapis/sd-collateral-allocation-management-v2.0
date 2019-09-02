package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCollateralAssetAllocationRetrieveOutputModelCollateralAssetAllocationInstanceAnalysis;
import org.bian.dto.CRCollateralAssetAllocationRetrieveOutputModelCollateralAssetAllocationInstanceRecord;
import org.bian.dto.CRCollateralAssetAllocationRetrieveOutputModelCollateralAssetAllocationInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCollateralAssetAllocationRetrieveOutputModel
 */
public class CRCollateralAssetAllocationRetrieveOutputModel   {
  private CRCollateralAssetAllocationRetrieveOutputModelCollateralAssetAllocationInstanceRecord collateralAssetAllocationInstanceRecord = null;

  private String collateralAssetAllocationRetrieveActionTaskReference = null;

  private Object collateralAssetAllocationRetrieveActionTaskRecord = null;

  private String collateralAssetAllocationRetrieveActionResponse = null;

  private CRCollateralAssetAllocationRetrieveOutputModelCollateralAssetAllocationInstanceReportRecord collateralAssetAllocationInstanceReportRecord = null;

  private CRCollateralAssetAllocationRetrieveOutputModelCollateralAssetAllocationInstanceAnalysis collateralAssetAllocationInstanceAnalysis = null;


  /**
   * Get collateralAssetAllocationInstanceRecord
   * @return collateralAssetAllocationInstanceRecord
  **/

  public CRCollateralAssetAllocationRetrieveOutputModelCollateralAssetAllocationInstanceRecord getCollateralAssetAllocationInstanceRecord() {
    return collateralAssetAllocationInstanceRecord;
  }

  public void setCollateralAssetAllocationInstanceRecord(CRCollateralAssetAllocationRetrieveOutputModelCollateralAssetAllocationInstanceRecord collateralAssetAllocationInstanceRecord) {
    this.collateralAssetAllocationInstanceRecord = collateralAssetAllocationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Collateral Asset Allocation instance retrieve service call 
   * @return collateralAssetAllocationRetrieveActionTaskReference
  **/

  public String getCollateralAssetAllocationRetrieveActionTaskReference() {
    return collateralAssetAllocationRetrieveActionTaskReference;
  }

  public void setCollateralAssetAllocationRetrieveActionTaskReference(String collateralAssetAllocationRetrieveActionTaskReference) {
    this.collateralAssetAllocationRetrieveActionTaskReference = collateralAssetAllocationRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return collateralAssetAllocationRetrieveActionTaskRecord
  **/

  public Object getCollateralAssetAllocationRetrieveActionTaskRecord() {
    return collateralAssetAllocationRetrieveActionTaskRecord;
  }

  public void setCollateralAssetAllocationRetrieveActionTaskRecord(Object collateralAssetAllocationRetrieveActionTaskRecord) {
    this.collateralAssetAllocationRetrieveActionTaskRecord = collateralAssetAllocationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return collateralAssetAllocationRetrieveActionResponse
  **/

  public String getCollateralAssetAllocationRetrieveActionResponse() {
    return collateralAssetAllocationRetrieveActionResponse;
  }

  public void setCollateralAssetAllocationRetrieveActionResponse(String collateralAssetAllocationRetrieveActionResponse) {
    this.collateralAssetAllocationRetrieveActionResponse = collateralAssetAllocationRetrieveActionResponse;
  }


  /**
   * Get collateralAssetAllocationInstanceReportRecord
   * @return collateralAssetAllocationInstanceReportRecord
  **/

  public CRCollateralAssetAllocationRetrieveOutputModelCollateralAssetAllocationInstanceReportRecord getCollateralAssetAllocationInstanceReportRecord() {
    return collateralAssetAllocationInstanceReportRecord;
  }

  public void setCollateralAssetAllocationInstanceReportRecord(CRCollateralAssetAllocationRetrieveOutputModelCollateralAssetAllocationInstanceReportRecord collateralAssetAllocationInstanceReportRecord) {
    this.collateralAssetAllocationInstanceReportRecord = collateralAssetAllocationInstanceReportRecord;
  }


  /**
   * Get collateralAssetAllocationInstanceAnalysis
   * @return collateralAssetAllocationInstanceAnalysis
  **/

  public CRCollateralAssetAllocationRetrieveOutputModelCollateralAssetAllocationInstanceAnalysis getCollateralAssetAllocationInstanceAnalysis() {
    return collateralAssetAllocationInstanceAnalysis;
  }

  public void setCollateralAssetAllocationInstanceAnalysis(CRCollateralAssetAllocationRetrieveOutputModelCollateralAssetAllocationInstanceAnalysis collateralAssetAllocationInstanceAnalysis) {
    this.collateralAssetAllocationInstanceAnalysis = collateralAssetAllocationInstanceAnalysis;
  }


}

