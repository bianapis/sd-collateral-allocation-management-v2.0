package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAllocationExchangeOutputModel
 */
public class BQAllocationExchangeOutputModel   {
  private String allocationExchangeActionTaskReference = null;

  private Object allocationExchangeActionTaskRecord = null;

  private String allocationExchangeActionResponse = null;

  private String allocationInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Allocation instance exchange service call 
   * @return allocationExchangeActionTaskReference
  **/

  public String getAllocationExchangeActionTaskReference() {
    return allocationExchangeActionTaskReference;
  }

  public void setAllocationExchangeActionTaskReference(String allocationExchangeActionTaskReference) {
    this.allocationExchangeActionTaskReference = allocationExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return allocationExchangeActionTaskRecord
  **/

  public Object getAllocationExchangeActionTaskRecord() {
    return allocationExchangeActionTaskRecord;
  }

  public void setAllocationExchangeActionTaskRecord(Object allocationExchangeActionTaskRecord) {
    this.allocationExchangeActionTaskRecord = allocationExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return allocationExchangeActionResponse
  **/

  public String getAllocationExchangeActionResponse() {
    return allocationExchangeActionResponse;
  }

  public void setAllocationExchangeActionResponse(String allocationExchangeActionResponse) {
    this.allocationExchangeActionResponse = allocationExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Allocation instance (e.g. accepted, rejected, verified) 
   * @return allocationInstanceStatus
  **/

  public String getAllocationInstanceStatus() {
    return allocationInstanceStatus;
  }

  public void setAllocationInstanceStatus(String allocationInstanceStatus) {
    this.allocationInstanceStatus = allocationInstanceStatus;
  }


}

