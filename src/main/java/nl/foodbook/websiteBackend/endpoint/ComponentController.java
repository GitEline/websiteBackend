package nl.foodbook.websiteBackend.endpoint;

import nl.foodbook.websiteBackend.domain.Component;
import nl.foodbook.websiteBackend.service.ComponentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ComponentController {

    @Autowired
    private final ComponentService componentService;

    public ComponentController(ComponentService componentService) {
        this.componentService = componentService;
    }


    @GetMapping("/component")
    public List<Component> getComponents(){
        return (List<Component>) componentService.findAllComponents();
    }

    @PostMapping("/component")
    void addComponent(@RequestBody Component component) {
        componentService.addComponent(component);
    }


}
