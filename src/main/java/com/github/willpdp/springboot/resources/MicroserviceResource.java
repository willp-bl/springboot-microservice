package com.github.willpdp.springboot.resources;

import com.github.willpdp.springboot.domain.GravyDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static com.github.willpdp.springboot.domain.builders.GravyBuilder.aGravyBuilder;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class MicroserviceResource {
    @RequestMapping(path = "/doesThisFoodNeedGravy", method = GET)
    public GravyDto doesThisFoodNeedGravy(@RequestParam(name = "food", defaultValue = "everything") String food) {
        return aGravyBuilder().forFood(food).build();
    }
}
