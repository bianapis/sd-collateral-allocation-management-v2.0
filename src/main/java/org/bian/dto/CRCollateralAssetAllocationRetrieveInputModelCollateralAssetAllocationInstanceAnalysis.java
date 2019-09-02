package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCollateralAssetAllocationRetrieveInputModelCollateralAssetAllocationInstanceAnalysis
 */
public class CRCollateralAssetAllocationRetrieveInputModelCollateralAssetAllocationInstanceAnalysis   {
  private String collateralAssetAllocationInstanceAnalysisReference = null;

  private String collateralAssetAllocationInstanceAnalysisReportType = null;

  private String collateralAssetAllocationInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return collateralAssetAllocationInstanceAnalysisReference
  **/

  public String getCollateralAssetAllocationInstanceAnalysisReference() {
    return collateralAssetAllocationInstanceAnalysisReference;
  }

  public void setCollateralAssetAllocationInstanceAnalysisReference(String collateralAssetAllocationInstanceAnalysisReference) {
    this.collateralAssetAllocationInstanceAnalysisReference = collateralAssetAllocationInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return collateralAssetAllocationInstanceAnalysisParameters
  **/

  public String getCollateralAssetAllocationInstanceAnalysisParameters() {
    return collateralAssetAllocationInstanceAnalysisParameters;
  }

  public void setCollateralAssetAllocationInstanceAnalysisParameters(String collateralAssetAllocationInstanceAnalysisParameters) {
    this.collateralAssetAllocationInstanceAnalysisParameters = collateralAssetAllocationInstanceAnalysisParameters;
  }


}

