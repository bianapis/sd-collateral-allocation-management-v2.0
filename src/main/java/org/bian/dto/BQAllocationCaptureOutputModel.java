package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAllocationCaptureInputModelAllocationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAllocationCaptureOutputModel
 */
public class BQAllocationCaptureOutputModel   {
  private BQAllocationCaptureInputModelAllocationInstanceRecord allocationInstanceRecord = null;

  private String allocationCaptureActionTaskReference = null;

  private Object allocationCaptureActionTaskRecord = null;

  private String allocationCaptureRecordReference = null;

  private Object captureResponseRecord = null;


  /**
   * Get allocationInstanceRecord
   * @return allocationInstanceRecord
  **/

  public BQAllocationCaptureInputModelAllocationInstanceRecord getAllocationInstanceRecord() {
    return allocationInstanceRecord;
  }

  public void setAllocationInstanceRecord(BQAllocationCaptureInputModelAllocationInstanceRecord allocationInstanceRecord) {
    this.allocationInstanceRecord = allocationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Allocation instance capture service call 
   * @return allocationCaptureActionTaskReference
  **/

  public String getAllocationCaptureActionTaskReference() {
    return allocationCaptureActionTaskReference;
  }

  public void setAllocationCaptureActionTaskReference(String allocationCaptureActionTaskReference) {
    this.allocationCaptureActionTaskReference = allocationCaptureActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return allocationCaptureActionTaskRecord
  **/

  public Object getAllocationCaptureActionTaskRecord() {
    return allocationCaptureActionTaskRecord;
  }

  public void setAllocationCaptureActionTaskRecord(Object allocationCaptureActionTaskRecord) {
    this.allocationCaptureActionTaskRecord = allocationCaptureActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Allocation structured input transaction/record 
   * @return allocationCaptureRecordReference
  **/

  public String getAllocationCaptureRecordReference() {
    return allocationCaptureRecordReference;
  }

  public void setAllocationCaptureRecordReference(String allocationCaptureRecordReference) {
    this.allocationCaptureRecordReference = allocationCaptureRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the capture action service response 
   * @return captureResponseRecord
  **/

  public Object getCaptureResponseRecord() {
    return captureResponseRecord;
  }

  public void setCaptureResponseRecord(Object captureResponseRecord) {
    this.captureResponseRecord = captureResponseRecord;
  }


}

