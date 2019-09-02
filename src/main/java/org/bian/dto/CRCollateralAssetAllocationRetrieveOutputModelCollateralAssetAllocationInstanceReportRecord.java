package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCollateralAssetAllocationRetrieveOutputModelCollateralAssetAllocationInstanceReportRecord
 */
public class CRCollateralAssetAllocationRetrieveOutputModelCollateralAssetAllocationInstanceReportRecord   {
  private String collateralAssetAllocationInstanceReportData = null;

  private String collateralAssetAllocationInstanceReportType = null;

  private Object collateralAssetAllocationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return collateralAssetAllocationInstanceReportData
  **/

  public String getCollateralAssetAllocationInstanceReportData() {
    return collateralAssetAllocationInstanceReportData;
  }

  public void setCollateralAssetAllocationInstanceReportData(String collateralAssetAllocationInstanceReportData) {
    this.collateralAssetAllocationInstanceReportData = collateralAssetAllocationInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return collateralAssetAllocationInstanceReportType
  **/

  public String getCollateralAssetAllocationInstanceReportType() {
    return collateralAssetAllocationInstanceReportType;
  }

  public void setCollateralAssetAllocationInstanceReportType(String collateralAssetAllocationInstanceReportType) {
    this.collateralAssetAllocationInstanceReportType = collateralAssetAllocationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return collateralAssetAllocationInstanceReport
  **/

  public Object getCollateralAssetAllocationInstanceReport() {
    return collateralAssetAllocationInstanceReport;
  }

  public void setCollateralAssetAllocationInstanceReport(Object collateralAssetAllocationInstanceReport) {
    this.collateralAssetAllocationInstanceReport = collateralAssetAllocationInstanceReport;
  }


}

