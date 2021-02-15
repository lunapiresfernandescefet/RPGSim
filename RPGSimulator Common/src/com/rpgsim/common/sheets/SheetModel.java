package com.rpgsim.common.sheets;

import java.io.Serializable;

public class SheetModel implements Serializable
{
    private final String[] info;
    private final String[] stats;
    private final String[] statsColor;
    private final String[] attributes;
    private final String[] attributesDiceNumbers;
    private final String[] skills;
    private final String[] skillsDiceNumbers;
    private final String[] equipments;

    private SheetModel()
    {
        this.info = null;
        this.stats = null;
        this.statsColor = null;
        this.attributes = null;
        this.attributesDiceNumbers = null;
        this.skills = null;
        this.skillsDiceNumbers = null;
        this.equipments = null;
    }

    public SheetModel(String[] info, 
            String[] stats, 
            String[] statsColor, 
            String[] attributes, 
            String[] attributesDiceNumbers, 
            String[] skills, 
            String[] skillsDiceNumbers, 
            String[] equipments)
    {
        this.info = info;
        this.stats = stats;
        this.statsColor = statsColor;
        this.attributes = attributes;
        this.attributesDiceNumbers = attributesDiceNumbers;
        this.skills = skills;
        this.skillsDiceNumbers = skillsDiceNumbers;
        this.equipments = equipments;
    }

    public String[] getInfo()
    {
        return info;
    }

    public String[] getStats()
    {
        return stats;
    }

    public String[] getStatsColor()
    {
        return statsColor;
    }

    public String[] getAttributes()
    {
        return attributes;
    }

    public String[] getAttributesDiceNumbers()
    {
        return attributesDiceNumbers;
    }

    public String[] getSkills()
    {
        return skills;
    }

    public String[] getSkillsDiceNumbers()
    {
        return skillsDiceNumbers;
    }

    public String[] getEquipments()
    {
        return equipments;
    }
    
}
