package com.john.spring.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.john.spring.dao.FcBuildingMapper;
import com.john.spring.dao.FcCellMapper;
import com.john.spring.dao.FcEstateMapper;
import com.john.spring.dao.FcUnitMapper;
import com.john.spring.dao.TblCompanyMapper;
import com.john.spring.entity.FcBuilding;
import com.john.spring.entity.FcCell;
import com.john.spring.entity.FcEstate;
import com.john.spring.entity.FcUnit;
import com.john.spring.entity.TblCompany;
import com.john.spring.req.CellMessage;
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

   @Autowired
   private FcCellMapper fcCellMapper;

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
         fcBuilding.setBuildingCode(selectBuilding.getEstateCode()+"B"+(i+1));
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
            fcUnit.setUnitCode(unitMessage.getBuildingCode()+"U"+(i+1));
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
      return i == units.size()? 1: 0;
   }

   public ArrayList<FcCell> insertCell(List<CellMessage> cellMessages) {
      final ArrayList<FcCell> fcCells = new ArrayList<>();
      for (CellMessage cellMessage : cellMessages) {
         for (int i = cellMessage.getStartFloor(); i <= cellMessage.getStopFloor(); i++) {
            for (int j = cellMessage.getStartCellId(); j < cellMessage.getStopCellId(); j++) {
               final FcCell fcCell = new FcCell();
               fcCell.setUnitCode(cellMessage.getUnitCode());
               fcCell.setCellCode(i+""+j);
               fcCell.setFloorNumber(i);
               fcCell.setCellName(i+"-"+j);
               fcCells.add(fcCell);
               fcCellMapper.insert(fcCell);
            }
         }
      }
      return fcCells;
   }

   public List<FcBuilding> selectBuildingsByEstateCode(String estateCode) {
      final QueryWrapper<FcBuilding> queryWrapper = new QueryWrapper<>();
      queryWrapper.eq("estate_code", estateCode);
      queryWrapper.select("building_code", "building_name");
      return fcBuildingMapper.selectList(queryWrapper);
   }

   public List<FcUnit> selectUnitsByBuildingCode(String buildingCode) {
      final QueryWrapper<FcUnit> queryWrapper = new QueryWrapper<>();
      queryWrapper.eq("building_code", buildingCode);
      queryWrapper.select("unit_code", "unit_name");
      return fcUnitMapper.selectList(queryWrapper);
   }
   public List<FcCell> selectCellsByUnitCode(String estateCode) {
      final QueryWrapper<FcCell> queryWrapper = new QueryWrapper<>();
      queryWrapper.eq("unit_code", estateCode);
      queryWrapper.select("floor_number","cell_code", "cell_name");
      return fcCellMapper.selectList(queryWrapper);
   }
}
