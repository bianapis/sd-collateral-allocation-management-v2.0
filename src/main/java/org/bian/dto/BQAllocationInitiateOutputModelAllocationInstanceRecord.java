package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAllocationInitiateOutputModelAllocationInstanceRecord
 */
public class BQAllocationInitiateOutputModelAllocationInstanceRecord   {
  private String collateralAllocationRecallResult = null;

  private String collateralAssetAllocationState = null;

  private String collateralAllocationRequestResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The result of the allocation recall 
   * @return collateralAllocationRecallResult
  **/

  public String getCollateralAllocationRecallResult() {
    return collateralAllocationRecallResult;
  }

  public void setCollateralAllocationRecallResult(String collateralAllocationRecallResult) {
    this.collateralAllocationRecallResult = collateralAllocationRecallResult;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: State of the allocation as there can be different states for the allocation of a single asset to several products 
   * @return collateralAssetAllocationState
  **/

  public String getCollateralAssetAllocationState() {
    return collateralAssetAllocationState;
  }

  public void setCollateralAssetAllocationState(String collateralAssetAllocationState) {
    this.collateralAssetAllocationState = collateralAssetAllocationState;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Record of the workstep and result of the allocation process 
   * @return collateralAllocationRequestResult
  **/

  public String getCollateralAllocationRequestResult() {
    return collateralAllocationRequestResult;
  }

  public void setCollateralAllocationRequestResult(String collateralAllocationRequestResult) {
    this.collateralAllocationRequestResult = collateralAllocationRequestResult;
  }


}

