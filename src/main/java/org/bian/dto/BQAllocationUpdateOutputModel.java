package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAllocationUpdateInputModelAllocationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAllocationUpdateOutputModel
 */
public class BQAllocationUpdateOutputModel   {
  private BQAllocationUpdateInputModelAllocationInstanceRecord allocationInstanceRecord = null;

  private String allocationUpdateActionTaskReference = null;

  private Object allocationUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get allocationInstanceRecord
   * @return allocationInstanceRecord
  **/

  public BQAllocationUpdateInputModelAllocationInstanceRecord getAllocationInstanceRecord() {
    return allocationInstanceRecord;
  }

  public void setAllocationInstanceRecord(BQAllocationUpdateInputModelAllocationInstanceRecord allocationInstanceRecord) {
    this.allocationInstanceRecord = allocationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return allocationUpdateActionTaskReference
  **/

  public String getAllocationUpdateActionTaskReference() {
    return allocationUpdateActionTaskReference;
  }

  public void setAllocationUpdateActionTaskReference(String allocationUpdateActionTaskReference) {
    this.allocationUpdateActionTaskReference = allocationUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return allocationUpdateActionTaskRecord
  **/

  public Object getAllocationUpdateActionTaskRecord() {
    return allocationUpdateActionTaskRecord;
  }

  public void setAllocationUpdateActionTaskRecord(Object allocationUpdateActionTaskRecord) {
    this.allocationUpdateActionTaskRecord = allocationUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

