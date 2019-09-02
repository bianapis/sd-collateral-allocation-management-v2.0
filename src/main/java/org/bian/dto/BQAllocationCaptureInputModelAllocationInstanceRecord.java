package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAllocationCaptureInputModelAllocationInstanceRecord
 */
public class BQAllocationCaptureInputModelAllocationInstanceRecord   {
  private String collateralAllocationAmount = null;

  private String collateralAllocationDuration = null;

  private String collateralAllocationRecallAmount = null;

  private String collateralAllocationRecallTimetable = null;

  private String collateralAllocationRecallResult = null;

  private String collateralAssetAllocationState = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: The amount of the overall asset value that is allocated in this instance 
   * @return collateralAllocationAmount
  **/

  public String getCollateralAllocationAmount() {
    return collateralAllocationAmount;
  }

  public void setCollateralAllocationAmount(String collateralAllocationAmount) {
    this.collateralAllocationAmount = collateralAllocationAmount;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The intended duration of the allocation (can be finite or open ended) 
   * @return collateralAllocationDuration
  **/

  public String getCollateralAllocationDuration() {
    return collateralAllocationDuration;
  }

  public void setCollateralAllocationDuration(String collateralAllocationDuration) {
    this.collateralAllocationDuration = collateralAllocationDuration;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: Applies when part or all of the allocation is recalled (e.g. due to revaluation of the asset) 
   * @return collateralAllocationRecallAmount
  **/

  public String getCollateralAllocationRecallAmount() {
    return collateralAllocationRecallAmount;
  }

  public void setCollateralAllocationRecallAmount(String collateralAllocationRecallAmount) {
    this.collateralAllocationRecallAmount = collateralAllocationRecallAmount;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule for processing allocation recall 
   * @return collateralAllocationRecallTimetable
  **/

  public String getCollateralAllocationRecallTimetable() {
    return collateralAllocationRecallTimetable;
  }

  public void setCollateralAllocationRecallTimetable(String collateralAllocationRecallTimetable) {
    this.collateralAllocationRecallTimetable = collateralAllocationRecallTimetable;
  }


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


}

