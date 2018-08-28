package com.github.willpdp.springboot.resources;

import com.github.willpdp.springboot.domain.GravyDto;
import com.github.willpdp.springboot.domain.builders.GravyDtoBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static com.github.willpdp.springboot.Urls.DOES_THIS_FOOD_NEED_GRAVY_RESOURCE;
import static com.github.willpdp.springboot.domain.builders.GravyDtoBuilder.aGravyBuilder;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class MicroserviceResource {
    @RequestMapping(path = DOES_THIS_FOOD_NEED_GRAVY_RESOURCE, method = GET)
    public GravyDto doesThisFoodNeedGravy(@RequestParam(name = "food", defaultValue = "everything") String food) {
        final GravyDtoBuilder gravyDtoBuilder = aGravyBuilder().forFood(food);
        if("icecream".equals(food)) {
            gravyDtoBuilder.needsGravy(Boolean.FALSE);
        }
        return gravyDtoBuilder.build();
    }
}
