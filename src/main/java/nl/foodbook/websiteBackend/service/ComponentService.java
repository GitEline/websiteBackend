package nl.foodbook.websiteBackend.service;

import nl.foodbook.websiteBackend.domain.Component;
import nl.foodbook.websiteBackend.repository.ComponentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComponentService {

    @Autowired
    private final ComponentRepository componentRepository;

    public ComponentService(ComponentRepository componentRepository) {
        this.componentRepository = componentRepository;
    }


    public Iterable<Component> findAllComponents(){
        return componentRepository.findAll();
    }

    public void addComponent(Component component){
        componentRepository.save(component);
    }


}
