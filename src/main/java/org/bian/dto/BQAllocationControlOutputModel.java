package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAllocationControlOutputModel
 */
public class BQAllocationControlOutputModel   {
  private String allocationControlActionTaskReference = null;

  private Object allocationControlActionTaskRecord = null;

  private String allocationControlActionResponse = null;

  private String allocationInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Allocation instance control processing service call 
   * @return allocationControlActionTaskReference
  **/

  public String getAllocationControlActionTaskReference() {
    return allocationControlActionTaskReference;
  }

  public void setAllocationControlActionTaskReference(String allocationControlActionTaskReference) {
    this.allocationControlActionTaskReference = allocationControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return allocationControlActionTaskRecord
  **/

  public Object getAllocationControlActionTaskRecord() {
    return allocationControlActionTaskRecord;
  }

  public void setAllocationControlActionTaskRecord(Object allocationControlActionTaskRecord) {
    this.allocationControlActionTaskRecord = allocationControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return allocationControlActionResponse
  **/

  public String getAllocationControlActionResponse() {
    return allocationControlActionResponse;
  }

  public void setAllocationControlActionResponse(String allocationControlActionResponse) {
    this.allocationControlActionResponse = allocationControlActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Allocation instance (e.g. initialised, pending, active) 
   * @return allocationInstanceStatus
  **/

  public String getAllocationInstanceStatus() {
    return allocationInstanceStatus;
  }

  public void setAllocationInstanceStatus(String allocationInstanceStatus) {
    this.allocationInstanceStatus = allocationInstanceStatus;
  }


}

