package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAllocationRetrieveOutputModelAllocationInstanceReport
 */
public class BQAllocationRetrieveOutputModelAllocationInstanceReport   {
  private Object allocationInstanceReportRecord = null;

  private String allocationInstanceReportType = null;

  private String allocationInstanceReportParameters = null;

  private Object allocationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return allocationInstanceReportRecord
  **/

  public Object getAllocationInstanceReportRecord() {
    return allocationInstanceReportRecord;
  }

  public void setAllocationInstanceReportRecord(Object allocationInstanceReportRecord) {
    this.allocationInstanceReportRecord = allocationInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return allocationInstanceReportType
  **/

  public String getAllocationInstanceReportType() {
    return allocationInstanceReportType;
  }

  public void setAllocationInstanceReportType(String allocationInstanceReportType) {
    this.allocationInstanceReportType = allocationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return allocationInstanceReportParameters
  **/

  public String getAllocationInstanceReportParameters() {
    return allocationInstanceReportParameters;
  }

  public void setAllocationInstanceReportParameters(String allocationInstanceReportParameters) {
    this.allocationInstanceReportParameters = allocationInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return allocationInstanceReport
  **/

  public Object getAllocationInstanceReport() {
    return allocationInstanceReport;
  }

  public void setAllocationInstanceReport(Object allocationInstanceReport) {
    this.allocationInstanceReport = allocationInstanceReport;
  }


}

