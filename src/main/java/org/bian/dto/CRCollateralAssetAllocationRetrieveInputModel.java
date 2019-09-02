package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCollateralAssetAllocationRetrieveInputModelCollateralAssetAllocationInstanceAnalysis;
import org.bian.dto.CRCollateralAssetAllocationRetrieveInputModelCollateralAssetAllocationInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCollateralAssetAllocationRetrieveInputModel
 */
public class CRCollateralAssetAllocationRetrieveInputModel   {
  private Object collateralAssetAllocationRetrieveActionTaskRecord = null;

  private String collateralAssetAllocationRetrieveActionRequest = null;

  private CRCollateralAssetAllocationRetrieveInputModelCollateralAssetAllocationInstanceReportRecord collateralAssetAllocationInstanceReportRecord = null;

  private CRCollateralAssetAllocationRetrieveInputModelCollateralAssetAllocationInstanceAnalysis collateralAssetAllocationInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return collateralAssetAllocationRetrieveActionRequest
  **/

  public String getCollateralAssetAllocationRetrieveActionRequest() {
    return collateralAssetAllocationRetrieveActionRequest;
  }

  public void setCollateralAssetAllocationRetrieveActionRequest(String collateralAssetAllocationRetrieveActionRequest) {
    this.collateralAssetAllocationRetrieveActionRequest = collateralAssetAllocationRetrieveActionRequest;
  }


  /**
   * Get collateralAssetAllocationInstanceReportRecord
   * @return collateralAssetAllocationInstanceReportRecord
  **/

  public CRCollateralAssetAllocationRetrieveInputModelCollateralAssetAllocationInstanceReportRecord getCollateralAssetAllocationInstanceReportRecord() {
    return collateralAssetAllocationInstanceReportRecord;
  }

  public void setCollateralAssetAllocationInstanceReportRecord(CRCollateralAssetAllocationRetrieveInputModelCollateralAssetAllocationInstanceReportRecord collateralAssetAllocationInstanceReportRecord) {
    this.collateralAssetAllocationInstanceReportRecord = collateralAssetAllocationInstanceReportRecord;
  }


  /**
   * Get collateralAssetAllocationInstanceAnalysis
   * @return collateralAssetAllocationInstanceAnalysis
  **/

  public CRCollateralAssetAllocationRetrieveInputModelCollateralAssetAllocationInstanceAnalysis getCollateralAssetAllocationInstanceAnalysis() {
    return collateralAssetAllocationInstanceAnalysis;
  }

  public void setCollateralAssetAllocationInstanceAnalysis(CRCollateralAssetAllocationRetrieveInputModelCollateralAssetAllocationInstanceAnalysis collateralAssetAllocationInstanceAnalysis) {
    this.collateralAssetAllocationInstanceAnalysis = collateralAssetAllocationInstanceAnalysis;
  }


}

