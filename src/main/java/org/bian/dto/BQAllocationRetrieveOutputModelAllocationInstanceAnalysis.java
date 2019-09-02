package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAllocationRetrieveOutputModelAllocationInstanceAnalysis
 */
public class BQAllocationRetrieveOutputModelAllocationInstanceAnalysis   {
  private Object allocationInstanceAnalysisRecord = null;

  private String allocationInstanceAnalysisReportType = null;

  private String allocationInstanceAnalysisParameters = null;

  private Object allocationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return allocationInstanceAnalysisRecord
  **/

  public Object getAllocationInstanceAnalysisRecord() {
    return allocationInstanceAnalysisRecord;
  }

  public void setAllocationInstanceAnalysisRecord(Object allocationInstanceAnalysisRecord) {
    this.allocationInstanceAnalysisRecord = allocationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return allocationInstanceAnalysisReportType
  **/

  public String getAllocationInstanceAnalysisReportType() {
    return allocationInstanceAnalysisReportType;
  }

  public void setAllocationInstanceAnalysisReportType(String allocationInstanceAnalysisReportType) {
    this.allocationInstanceAnalysisReportType = allocationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return allocationInstanceAnalysisParameters
  **/

  public String getAllocationInstanceAnalysisParameters() {
    return allocationInstanceAnalysisParameters;
  }

  public void setAllocationInstanceAnalysisParameters(String allocationInstanceAnalysisParameters) {
    this.allocationInstanceAnalysisParameters = allocationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return allocationInstanceAnalysisReport
  **/

  public Object getAllocationInstanceAnalysisReport() {
    return allocationInstanceAnalysisReport;
  }

  public void setAllocationInstanceAnalysisReport(Object allocationInstanceAnalysisReport) {
    this.allocationInstanceAnalysisReport = allocationInstanceAnalysisReport;
  }


}

