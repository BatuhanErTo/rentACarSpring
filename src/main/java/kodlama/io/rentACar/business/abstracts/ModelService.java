package kodlama.io.rentACar.business.abstracts;

import kodlama.io.rentACar.business.reguests.CreateModelRequest;
import kodlama.io.rentACar.business.responses.GetAllModelsResponse;

import java.util.List;

public interface ModelService {
    List<GetAllModelsResponse> getAll();
    void add(CreateModelRequest createModelRequest);
}
