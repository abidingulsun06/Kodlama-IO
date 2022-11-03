package arge.Odev1.business.abstracts.technologies;

import arge.Odev1.business.requests.technologies.CreateTechnologiesRequest;
import arge.Odev1.business.requests.technologies.UpdateTechnologiesRequest;
import arge.Odev1.business.responses.technologies.GetAllTechnologiesResponse;
import arge.Odev1.business.responses.technologies.GetByIdTechnologiesResponse;

import java.util.List;

public interface TechnologiesService {
    List<GetAllTechnologiesResponse> getAll();
    void add(CreateTechnologiesRequest createTechnologiesRequest);
    void update(UpdateTechnologiesRequest updateTechnologiesRequest);
    void delete(int id);
    GetByIdTechnologiesResponse findById(int id);
}
