package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAllocationInitiateOutputModelCollateralAssetAllocationInstanceRecord
 */
public class BQAllocationInitiateOutputModelCollateralAssetAllocationInstanceRecord   {
  private String collateralAssetAdministrationInstanceReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the administration record of the asset item 
   * @return collateralAssetAdministrationInstanceReference
  **/

  public String getCollateralAssetAdministrationInstanceReference() {
    return collateralAssetAdministrationInstanceReference;
  }

  public void setCollateralAssetAdministrationInstanceReference(String collateralAssetAdministrationInstanceReference) {
    this.collateralAssetAdministrationInstanceReference = collateralAssetAdministrationInstanceReference;
  }


}

