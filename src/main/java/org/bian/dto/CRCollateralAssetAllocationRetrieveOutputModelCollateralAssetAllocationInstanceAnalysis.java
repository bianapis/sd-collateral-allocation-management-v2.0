package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCollateralAssetAllocationRetrieveOutputModelCollateralAssetAllocationInstanceAnalysis
 */
public class CRCollateralAssetAllocationRetrieveOutputModelCollateralAssetAllocationInstanceAnalysis   {
  private String collateralAssetAllocationInstanceAnalysisData = null;

  private String collateralAssetAllocationInstanceAnalysisReportType = null;

  private Object collateralAssetAllocationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return collateralAssetAllocationInstanceAnalysisData
  **/

  public String getCollateralAssetAllocationInstanceAnalysisData() {
    return collateralAssetAllocationInstanceAnalysisData;
  }

  public void setCollateralAssetAllocationInstanceAnalysisData(String collateralAssetAllocationInstanceAnalysisData) {
    this.collateralAssetAllocationInstanceAnalysisData = collateralAssetAllocationInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return collateralAssetAllocationInstanceAnalysisReportType
  **/

  public String getCollateralAssetAllocationInstanceAnalysisReportType() {
    return collateralAssetAllocationInstanceAnalysisReportType;
  }

  public void setCollateralAssetAllocationInstanceAnalysisReportType(String collateralAssetAllocationInstanceAnalysisReportType) {
    this.collateralAssetAllocationInstanceAnalysisReportType = collateralAssetAllocationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return collateralAssetAllocationInstanceAnalysisReport
  **/

  public Object getCollateralAssetAllocationInstanceAnalysisReport() {
    return collateralAssetAllocationInstanceAnalysisReport;
  }

  public void setCollateralAssetAllocationInstanceAnalysisReport(Object collateralAssetAllocationInstanceAnalysisReport) {
    this.collateralAssetAllocationInstanceAnalysisReport = collateralAssetAllocationInstanceAnalysisReport;
  }


}

