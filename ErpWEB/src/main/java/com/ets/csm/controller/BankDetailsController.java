package com.ets.csm.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ets.csm.model.MaterialCategories;
import com.ets.csm.model.MaterialsUser;
import com.ets.csm.model.PlatePostDetails;
import com.ets.csm.model.TierDetails;
import com.ets.csm.model.TierShape;
import com.ets.csm.model.User;
import com.ets.csm.service.MaterialUserService;
import com.ets.csm.service.PlatePostService;
import com.ets.csm.service.TierDetailsService;
import com.ets.csm.service.TierShapeService;

@Controller
@RequestMapping("/bankDetails")
public class BankDetailsController {

}
