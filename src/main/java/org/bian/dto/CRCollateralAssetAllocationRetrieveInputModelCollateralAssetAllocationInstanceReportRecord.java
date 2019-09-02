package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCollateralAssetAllocationRetrieveInputModelCollateralAssetAllocationInstanceReportRecord
 */
public class CRCollateralAssetAllocationRetrieveInputModelCollateralAssetAllocationInstanceReportRecord   {
  private String collateralAssetAllocationInstanceReportReference = null;

  private String collateralAssetAllocationInstanceReportType = null;

  private String collateralAssetAllocationInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return collateralAssetAllocationInstanceReportReference
  **/

  public String getCollateralAssetAllocationInstanceReportReference() {
    return collateralAssetAllocationInstanceReportReference;
  }

  public void setCollateralAssetAllocationInstanceReportReference(String collateralAssetAllocationInstanceReportReference) {
    this.collateralAssetAllocationInstanceReportReference = collateralAssetAllocationInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return collateralAssetAllocationInstanceReportParameters
  **/

  public String getCollateralAssetAllocationInstanceReportParameters() {
    return collateralAssetAllocationInstanceReportParameters;
  }

  public void setCollateralAssetAllocationInstanceReportParameters(String collateralAssetAllocationInstanceReportParameters) {
    this.collateralAssetAllocationInstanceReportParameters = collateralAssetAllocationInstanceReportParameters;
  }


}

