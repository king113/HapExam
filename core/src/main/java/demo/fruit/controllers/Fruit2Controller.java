package demo.fruit.controllers;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import demo.fruit.dto.Fruit2;
import demo.fruit.service.IFruit2Service;

@Controller
    public class Fruit2Controller extends BaseController{

    @Autowired
    private IFruit2Service service;

     /**
     * Created by CaiKai on 2017/4/21.
     */
    @RequestMapping(value = "/fruit/query")
    @ResponseBody
    public ResponseData query(Fruit2 dto, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
        @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pageSize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        return new ResponseData(service.select(requestContext, dto, page, pageSize));
    }

    @RequestMapping(value = "/fruit/submit")
    @ResponseBody
    public ResponseData batchUpdate(HttpServletRequest request,@RequestBody List<Fruit2> dto){
        IRequest requestCtx = createRequestContext(request);
        return new ResponseData(service.batchUpdate(requestCtx, dto));
    }

     @RequestMapping(value = "/fruit/update")
     @ResponseBody
        private ResponseData update(HttpServletRequest request, @RequestBody List<Fruit2> dot){
            IRequest  requestCtx= createRequestContext(request);
            return new ResponseData(service.batchUpdate(requestCtx, dot));
        }

        @RequestMapping(value = "/fruit/remove")
    @ResponseBody
    public ResponseData delete(HttpServletRequest request,@RequestBody List<Fruit2> dto){
        service.batchDelete(dto);
        return new ResponseData();
    }
    }