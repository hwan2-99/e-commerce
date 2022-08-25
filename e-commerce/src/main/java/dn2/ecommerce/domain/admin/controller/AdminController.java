package dn2.ecommerce.domain.admin.controller;

import dn2.ecommerce.domain.item.ItemDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping(value="/admin")
public class AdminController {

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String main(){
        return "admin/main";

    }

    @RequestMapping(value = "/item/read/{itemId}",method = RequestMethod.GET)
    public String ItemRead(@PathVariable("itemId")String itemId, Model model){
        ItemDTO itemDTO = itemService.read(itemId);
        model.addAttribute("ItemInfo",itemDTO);


    }





}
