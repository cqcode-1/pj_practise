package com.john.spring.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.john.spring.dao.FcBuildingMapper;
import com.john.spring.dao.FcEstateMapper;
import com.john.spring.dao.FcUnitMapper;
import com.john.spring.dao.TblCompanyMapper;
import com.john.spring.entity.FcBuilding;
import com.john.spring.entity.FcEstate;
import com.john.spring.entity.FcUnit;
import com.john.spring.entity.TblCompany;
import com.john.spring.req.SelectBuilding;
import com.john.spring.req.UnitMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.expression.spel.ast.Selection;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EstateService {

   @Autowired
   private TblCompanyMapper tblCompanyMapper;

   @Autowired
   private FcEstateMapper fcEstateMapper;

   @Autowired
   private FcBuildingMapper fcBuildingMapper;

   @Autowired
   private FcUnitMapper fcUnitMapper;

   public List<TblCompany> queryCompany(){
      return tblCompanyMapper.queryCompany();
   }

   /**
    * 插入信息
    * @param fcEstate
    * @return
    */
   public int insert(FcEstate fcEstate){
      final QueryWrapper<FcEstate> queryWrapper = new QueryWrapper<>();
      queryWrapper.eq("estate_code", fcEstate.getEstateCode());
      final FcEstate estate = fcEstateMapper.selectOne(queryWrapper);
      if(estate != null){
         return 0;
      }else{
         return fcEstateMapper.insert(fcEstate);
      }

   }

   public List<FcBuilding> selectBuildings(SelectBuilding selectBuilding){
      final Integer buildNumber = selectBuilding.getBuildingNumber();
      List<FcBuilding> result = new ArrayList<>();
      for (int i = 0; i < buildNumber; i++) {
         final FcBuilding fcBuilding = new FcBuilding();
         fcBuilding.setEstateCode(selectBuilding.getEstateCode());
         fcBuilding.setBuildingCode("B-"+(i+1));
         fcBuilding.setBuildingName("第"+(i+1)+"栋");
         result.add(fcBuilding);
         fcBuildingMapper.insert(fcBuilding);
      }
      return result;
   }

   public Integer updateBuilding(FcBuilding building) {
      final int update = fcBuildingMapper.updateById(building);
      return update;
   }
   public Integer updateBuildings(List<FcBuilding> building) {
      Integer i = 0;
      for (FcBuilding fcBuilding : building) {
         i += fcBuildingMapper.updateById(fcBuilding);
      }
      return i == building.size()-1? 1: 0;
   }

   public List<FcUnit> selectUnit(UnitMessage[] unitMessages) {
      final ArrayList<FcUnit> fcUnits = new ArrayList<>();
      for (UnitMessage unitMessage : unitMessages) {
         for (int i = 0; i < unitMessage.getUnitCount(); i++) {
            final FcUnit fcUnit = new FcUnit();
            fcUnit.setBuildingCode(unitMessage.getBuildingCode());
            fcUnit.setUnitCode("U-"+(i+1));
            fcUnit.setUnitName("第"+(i+1)+"单元");
            fcUnits.add(fcUnit);
            fcUnitMapper.insert(fcUnit);
         }
      }
      return fcUnits;
   }

   public Integer updateUnit(FcUnit unit) {
      return fcUnitMapper.updateById(unit);
   }

   public Integer updateUnits(List<FcUnit> units) {
      Integer i = 0;
      for (FcUnit fcUnit: units) {
         i += fcUnitMapper.updateById(fcUnit);
      }
      return i == units.size()-1? 1: 0;
   }
}
