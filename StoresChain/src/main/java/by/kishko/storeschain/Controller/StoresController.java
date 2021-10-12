package by.kishko.storeschain.Controller;

import by.kishko.storeschain.Model.Stores;
import by.kishko.storeschain.Model.StoresForm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
@Slf4g
@Controller
public class StoresController {
    private static List<Stores> stores = new ArrayList<>();

    static{
        stores.add(new Stores(1,"Euroopt","Minsk,Bobrujsksya 99",12));
        stores.add(new Stores(2,"Mila","Minsk,Bobrujsksya 13",4));
    }

    @Value("${welcome.message}")
    private String message;

    @Value("${error.message.allRequired}")
    private String errorMessage;

    @RequestMapping(value = { "/", "/index"},method = RequestMethod.GET)
    public ModelAndView index(Model model){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        model.addAttribute("message",message);
        return modelAndView;
    }

    @RequestMapping(value = "/allstores",method = RequestMethod.GET)
    public ModelAndView storesList(Model model){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("storesList");
        model.addAttribute("stores",stores);
        return modelAndView;
    }

    @GetMapping(value = "/addstore")
    public ModelAndView showAddStoresPage(Model model){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("addStore");
        StoresForm form = new StoresForm();
        model.addAttribute("storeform",form);
        model.addAttribute("errorMessage",errorMessage);
        return modelAndView;
    }

    @PostMapping(value = "/addstore")
    public ModelAndView addStores(Model model, @ModelAttribute("storeform") StoresForm storesForm){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("storesList");
        int id = storesForm.getId();
        String name = storesForm.getName();
        String address = storesForm.getAddress();
        int size = storesForm.getSize();
        if(IsNotNullOrEmpty(name)&&IsNotNullOrEmpty(address)){
            Stores store = new Stores(id,name,address,size);
            stores.add(store);
            model.addAttribute("stores",stores);
        }else{
            model.addAttribute("errorMessage",errorMessage);
            modelAndView.setViewName("addStore");
        }

        return modelAndView;
    }

    @GetMapping(value = "/editstore")
    public ModelAndView showEditStoresPage(Model model){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editStore");
        StoresForm form = new StoresForm();
        model.addAttribute("storeform",form);
        model.addAttribute("errorMessage",errorMessage);
        return modelAndView;
    }

    @PostMapping(value = "/editstore")
    public ModelAndView editStores(Model model, @ModelAttribute("storeform") StoresForm storesForm){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("storesList");
        int id = storesForm.getId();
        String name = storesForm.getName();
        String address = storesForm.getAddress();
        int size = storesForm.getSize();
        if(IsNotNullOrEmpty(name)&&IsNotNullOrEmpty(address)){
            Stores store = new Stores(id,name,address,size);
            for(int i=0;i< stores.toArray().length;i++){
                if(store.getId()==stores.get(i).getId()){
                    stores.remove(i);
                    stores.add(store);
                    break;
                }
                model.addAttribute("errorMessage","such store does not exist");
            }
            model.addAttribute("stores",stores);
        }else{
            model.addAttribute("errorMessage",errorMessage);
            modelAndView.setViewName("deleteStore");
        }

        return modelAndView;
    }

    @GetMapping(value = "/deletestore")
    public ModelAndView showDeleteStoresPage(Model model){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("deleteStore");
        StoresForm form = new StoresForm();
        model.addAttribute("storeform",form);
        model.addAttribute("errorMessage",errorMessage);
        return modelAndView;
    }

    @PostMapping(value = "/deletestore")
    public ModelAndView deleteStores(Model model, @ModelAttribute("storeform") StoresForm storesForm){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("storesList");
        int id = storesForm.getId();
            for(int i=0;i< stores.toArray().length;i++){
                if(id==stores.get(i).getId()){
                    stores.remove(i);
                    break;
                }
                model.addAttribute("errorMessage","such store does not exist");
            }
            model.addAttribute("stores",stores);
        return modelAndView;
    }


    private static boolean IsNotNullOrEmpty(String param){
        return param!=null && !param.isEmpty();
    }
}
