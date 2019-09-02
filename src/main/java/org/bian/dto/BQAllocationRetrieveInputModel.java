package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAllocationRetrieveInputModelAllocationInstanceAnalysis;
import org.bian.dto.BQAllocationRetrieveInputModelAllocationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQAllocationRetrieveInputModel
 */
public class BQAllocationRetrieveInputModel   {
  private Object allocationRetrieveActionTaskRecord = null;

  private String allocationRetrieveActionRequest = null;

  private BQAllocationRetrieveInputModelAllocationInstanceReport allocationInstanceReport = null;

  private BQAllocationRetrieveInputModelAllocationInstanceAnalysis allocationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return allocationRetrieveActionTaskRecord
  **/

  public Object getAllocationRetrieveActionTaskRecord() {
    return allocationRetrieveActionTaskRecord;
  }

  public void setAllocationRetrieveActionTaskRecord(Object allocationRetrieveActionTaskRecord) {
    this.allocationRetrieveActionTaskRecord = allocationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return allocationRetrieveActionRequest
  **/

  public String getAllocationRetrieveActionRequest() {
    return allocationRetrieveActionRequest;
  }

  public void setAllocationRetrieveActionRequest(String allocationRetrieveActionRequest) {
    this.allocationRetrieveActionRequest = allocationRetrieveActionRequest;
  }


  /**
   * Get allocationInstanceReport
   * @return allocationInstanceReport
  **/

  public BQAllocationRetrieveInputModelAllocationInstanceReport getAllocationInstanceReport() {
    return allocationInstanceReport;
  }

  public void setAllocationInstanceReport(BQAllocationRetrieveInputModelAllocationInstanceReport allocationInstanceReport) {
    this.allocationInstanceReport = allocationInstanceReport;
  }


  /**
   * Get allocationInstanceAnalysis
   * @return allocationInstanceAnalysis
  **/

  public BQAllocationRetrieveInputModelAllocationInstanceAnalysis getAllocationInstanceAnalysis() {
    return allocationInstanceAnalysis;
  }

  public void setAllocationInstanceAnalysis(BQAllocationRetrieveInputModelAllocationInstanceAnalysis allocationInstanceAnalysis) {
    this.allocationInstanceAnalysis = allocationInstanceAnalysis;
  }


}

