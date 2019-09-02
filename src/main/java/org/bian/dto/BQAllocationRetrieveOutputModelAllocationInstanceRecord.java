package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAllocationRetrieveOutputModelAllocationInstanceRecord
 */
public class BQAllocationRetrieveOutputModelAllocationInstanceRecord   {
  private String requestedAllocationRequestType = null;

  private String productInstanceReference = null;

  private String customerOfferReference = null;

  private String collateralEarmarkAmount = null;

  private String collateralEarmarkDuration = null;

  private String collateralAllocationAmount = null;

  private String collateralAllocationDuration = null;

  private String collateralAllocationRecallAmount = null;

  private String collateralAllocationRecallTimetable = null;

  private String collateralAllocationRecallResult = null;

  private String collateralAssetAllocationState = null;

  private String collateralAllocationRequestResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the requested action (e.g. earmark for future allocation, allocate or recall an allocation of a collateral asset) 
   * @return requestedAllocationRequestType
  **/

  public String getRequestedAllocationRequestType() {
    return requestedAllocationRequestType;
  }

  public void setRequestedAllocationRequestType(String requestedAllocationRequestType) {
    this.requestedAllocationRequestType = requestedAllocationRequestType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the product to which the collateral is allocated 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a offer process during which the collateral allocation is defined and agreed 
   * @return customerOfferReference
  **/

  public String getCustomerOfferReference() {
    return customerOfferReference;
  }

  public void setCustomerOfferReference(String customerOfferReference) {
    this.customerOfferReference = customerOfferReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: Applies for initial earmarking of collateral during an offer process 
   * @return collateralEarmarkAmount
  **/

  public String getCollateralEarmarkAmount() {
    return collateralEarmarkAmount;
  }

  public void setCollateralEarmarkAmount(String collateralEarmarkAmount) {
    this.collateralEarmarkAmount = collateralEarmarkAmount;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Time for which the earmarking is enforced 
   * @return collateralEarmarkDuration
  **/

  public String getCollateralEarmarkDuration() {
    return collateralEarmarkDuration;
  }

  public void setCollateralEarmarkDuration(String collateralEarmarkDuration) {
    this.collateralEarmarkDuration = collateralEarmarkDuration;
  }


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

