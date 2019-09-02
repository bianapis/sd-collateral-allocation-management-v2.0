/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CollateralAllocationManagementApiServiceImpl implements CollateralAllocationManagementApiService {

	public SDCollateralAllocationManagementActivateOutputModel activate(SDCollateralAllocationManagementActivateInputModel request){
		return JsonReader.read("activate-SDCollateralAllocationManagementActivateOutputModel.json",new TypeReference<SDCollateralAllocationManagementActivateOutputModel>(){});
	}
	
	public BQAllocationCaptureOutputModel captureAllocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAllocationCaptureInputModel request){
		return JsonReader.read("capture-BQAllocationCaptureOutputModel.json",new TypeReference<BQAllocationCaptureOutputModel>(){});
	}
	
	public SDCollateralAllocationManagementConfigureOutputModel configure(String sdReferenceId, SDCollateralAllocationManagementConfigureInputModel request){
		return JsonReader.read("configure-SDCollateralAllocationManagementConfigureOutputModel.json",new TypeReference<SDCollateralAllocationManagementConfigureOutputModel>(){});
	}
	
	public BQAllocationControlOutputModel controlAllocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAllocationControlInputModel request){
		return JsonReader.read("control-BQAllocationControlOutputModel.json",new TypeReference<BQAllocationControlOutputModel>(){});
	}
	
	public BQAllocationExchangeOutputModel exchangeAllocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAllocationExchangeInputModel request){
		return JsonReader.read("exchange-BQAllocationExchangeOutputModel.json",new TypeReference<BQAllocationExchangeOutputModel>(){});
	}
	
	public SDCollateralAllocationManagementFeedbackOutputModel feedback(String sdReferenceId, SDCollateralAllocationManagementFeedbackInputModel request){
		return JsonReader.read("feedback-SDCollateralAllocationManagementFeedbackOutputModel.json",new TypeReference<SDCollateralAllocationManagementFeedbackOutputModel>(){});
	}
	
	public BQAllocationGrantOutputModel grantAllocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAllocationGrantInputModel request){
		return JsonReader.read("grant-BQAllocationGrantOutputModel.json",new TypeReference<BQAllocationGrantOutputModel>(){});
	}
	
	public CRCollateralAssetAllocationInitiateOutputModel initiate(String sdReferenceId, CRCollateralAssetAllocationInitiateInputModel request){
		return JsonReader.read("initiate-CRCollateralAssetAllocationInitiateOutputModel.json",new TypeReference<CRCollateralAssetAllocationInitiateOutputModel>(){});
	}
	
	public BQAllocationInitiateOutputModel initiateAllocation(String sdReferenceId, String crReferenceId, BQAllocationInitiateInputModel request){
		return JsonReader.read("initiate-BQAllocationInitiateOutputModel.json",new TypeReference<BQAllocationInitiateOutputModel>(){});
	}
	
	public CRCollateralAssetAllocationRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCollateralAssetAllocationRetrieveOutputModel.json",new TypeReference<CRCollateralAssetAllocationRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQAllocationRetrieveOutputModel retrieveAllocation(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQAllocationRetrieveOutputModel.json",new TypeReference<BQAllocationRetrieveOutputModel>(){});
	}
	
	public SDCollateralAllocationManagementRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCollateralAllocationManagementRetrieveOutputModel.json",new TypeReference<SDCollateralAllocationManagementRetrieveOutputModel>(){});
	}
	
	public CRCollateralAssetAllocationUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCollateralAssetAllocationUpdateInputModel request){
		return JsonReader.read("update-CRCollateralAssetAllocationUpdateOutputModel.json",new TypeReference<CRCollateralAssetAllocationUpdateOutputModel>(){});
	}
	
	public BQAllocationUpdateOutputModel updateAllocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAllocationUpdateInputModel request){
		return JsonReader.read("update-BQAllocationUpdateOutputModel.json",new TypeReference<BQAllocationUpdateOutputModel>(){});
	}
	
}
