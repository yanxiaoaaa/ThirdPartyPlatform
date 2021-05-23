package com.science.resource.VO;

import com.science.resource.entity.Company;
import com.science.resource.entity.Equipment;
import com.science.resource.entity.Expert;
import com.science.resource.entity.PatentInfor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HomePageData {
    private long companyNum;
    private long equipmentNum;
    private long expertNum;
    private long patentInforNum;
    private List<Equipment> equipmentList;
    private List<Company> companies;
    private List<Expert> experts;
    private List<PatentInfor> patentInfors;
}
