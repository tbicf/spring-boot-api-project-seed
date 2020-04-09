package com.gsunis.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "busi_qrcode_service_evaluation")
public class QrCodeServiceEvaluation {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 服务类型：
S001-卫生间
S002-停车场
S003-餐厅
S004-超市
S005-汽修
S006-加油（气）站
S007-便民设施
S008-人性化服务
S009-投诉建议
     */
    @Column(name = "service_type")
    private String serviceType;

    /**
     * 工作人员文明服务满意度
     */
    private String service;

    /**
     * 卫生间是否满足实际需求
     */
    @Column(name = "toilet_need")
    private String toiletNeed;

    /**
     * 环境卫生满意度
     */
    @Column(name = "environ_health")
    private String environHealth;

    /**
     * 功能设施是否满足公共出行
     */
    private String facility;

    /**
     * 停车区和停车位划分是否合理
     */
    private String parking;

    /**
     * 治安情况和场区秩序满意度
     */
    private String safe;

    /**
     * 场区照明是否满意
     */
    private String light;

    /**
     * 菜品质量、口味、种类满意度
     */
    private String food;

    /**
     * 价格满意度
     */
    private String price;

    /**
     * 商品品种满意度
     */
    private String goods;

    /**
     * 商品质量满意度
     */
    private String quality;

    /**
     * 加油站工作效率和油品标号满意度
     */
    private String oils;

    /**
     * 免费热水满意度
     */
    @Column(name = "hot_water")
    private String hotWater;

    /**
     * 信息查询设备满意度
     */
    @Column(name = "info_query")
    private String infoQuery;

    /**
     * 免费手机充电设备满意度
     */
    @Column(name = "phone_charge")
    private String phoneCharge;

    /**
     * 免费wifi信号覆盖满意度
     */
    private String wifi;

    /**
     * 客房满意度
     */
    @Column(name = "guest_room")
    private String guestRoom;

    /**
     * 无障碍通道满意度
     */
    @Column(name = "easy_channel")
    private String easyChannel;

    /**
     * 母婴室满意度
     */
    @Column(name = "baby_room")
    private String babyRoom;

    /**
     * 医联体满意度
     */
    private String medical;

    /**
     * 司机之家满意度
     */
    @Column(name = "driver_home")
    private String driverHome;

    /**
     * 旅游咨询满意度
     */
    private String travel;

    /**
     * 特色商品示范店满意度
     */
    @Column(name = "model_shop")
    private String modelShop;

    /**
     * 充电桩满意度
     */
    @Column(name = "charging_pile")
    private String chargingPile;

    /**
     * 投诉建议
     */
    private String advice;

    /**
     * 服务区编号
     */
    @Column(name = "area_no")
    private String areaNo;

    /**
     * 服务区名称
     */
    @Column(name = "area_name")
    private String areaName;

    /**
     * 姓名
     */
    @Column(name = "u_name")
    private String uName;

    /**
     * 联系电话
     */
    @Column(name = "u_phone")
    private String uPhone;

    /**
     * 服务区整体评价：1-非常差，2-比较差，3-一般，4-良好，5-非常好。
     */
    private Byte star;

    /**
     * 创建时间
     */
    @Column(name = "pb_date")
    private Date pbDate;

    /**
     * 修改时间
     */
    @Column(name = "up_date")
    private Date upDate;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取服务类型：
S001-卫生间
S002-停车场
S003-餐厅
S004-超市
S005-汽修
S006-加油（气）站
S007-便民设施
S008-人性化服务
S009-投诉建议
     *
     * @return service_type - 服务类型：
S001-卫生间
S002-停车场
S003-餐厅
S004-超市
S005-汽修
S006-加油（气）站
S007-便民设施
S008-人性化服务
S009-投诉建议
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * 设置服务类型：
S001-卫生间
S002-停车场
S003-餐厅
S004-超市
S005-汽修
S006-加油（气）站
S007-便民设施
S008-人性化服务
S009-投诉建议
     *
     * @param serviceType 服务类型：
S001-卫生间
S002-停车场
S003-餐厅
S004-超市
S005-汽修
S006-加油（气）站
S007-便民设施
S008-人性化服务
S009-投诉建议
     */
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    /**
     * 获取工作人员文明服务满意度
     *
     * @return service - 工作人员文明服务满意度
     */
    public String getService() {
        return service;
    }

    /**
     * 设置工作人员文明服务满意度
     *
     * @param service 工作人员文明服务满意度
     */
    public void setService(String service) {
        this.service = service;
    }

    /**
     * 获取卫生间是否满足实际需求
     *
     * @return toilet_need - 卫生间是否满足实际需求
     */
    public String getToiletNeed() {
        return toiletNeed;
    }

    /**
     * 设置卫生间是否满足实际需求
     *
     * @param toiletNeed 卫生间是否满足实际需求
     */
    public void setToiletNeed(String toiletNeed) {
        this.toiletNeed = toiletNeed;
    }

    /**
     * 获取环境卫生满意度
     *
     * @return environ_health - 环境卫生满意度
     */
    public String getEnvironHealth() {
        return environHealth;
    }

    /**
     * 设置环境卫生满意度
     *
     * @param environHealth 环境卫生满意度
     */
    public void setEnvironHealth(String environHealth) {
        this.environHealth = environHealth;
    }

    /**
     * 获取功能设施是否满足公共出行
     *
     * @return facility - 功能设施是否满足公共出行
     */
    public String getFacility() {
        return facility;
    }

    /**
     * 设置功能设施是否满足公共出行
     *
     * @param facility 功能设施是否满足公共出行
     */
    public void setFacility(String facility) {
        this.facility = facility;
    }

    /**
     * 获取停车区和停车位划分是否合理
     *
     * @return parking - 停车区和停车位划分是否合理
     */
    public String getParking() {
        return parking;
    }

    /**
     * 设置停车区和停车位划分是否合理
     *
     * @param parking 停车区和停车位划分是否合理
     */
    public void setParking(String parking) {
        this.parking = parking;
    }

    /**
     * 获取治安情况和场区秩序满意度
     *
     * @return safe - 治安情况和场区秩序满意度
     */
    public String getSafe() {
        return safe;
    }

    /**
     * 设置治安情况和场区秩序满意度
     *
     * @param safe 治安情况和场区秩序满意度
     */
    public void setSafe(String safe) {
        this.safe = safe;
    }

    /**
     * 获取场区照明是否满意
     *
     * @return light - 场区照明是否满意
     */
    public String getLight() {
        return light;
    }

    /**
     * 设置场区照明是否满意
     *
     * @param light 场区照明是否满意
     */
    public void setLight(String light) {
        this.light = light;
    }

    /**
     * 获取菜品质量、口味、种类满意度
     *
     * @return food - 菜品质量、口味、种类满意度
     */
    public String getFood() {
        return food;
    }

    /**
     * 设置菜品质量、口味、种类满意度
     *
     * @param food 菜品质量、口味、种类满意度
     */
    public void setFood(String food) {
        this.food = food;
    }

    /**
     * 获取价格满意度
     *
     * @return price - 价格满意度
     */
    public String getPrice() {
        return price;
    }

    /**
     * 设置价格满意度
     *
     * @param price 价格满意度
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * 获取商品品种满意度
     *
     * @return goods - 商品品种满意度
     */
    public String getGoods() {
        return goods;
    }

    /**
     * 设置商品品种满意度
     *
     * @param goods 商品品种满意度
     */
    public void setGoods(String goods) {
        this.goods = goods;
    }

    /**
     * 获取商品质量满意度
     *
     * @return quality - 商品质量满意度
     */
    public String getQuality() {
        return quality;
    }

    /**
     * 设置商品质量满意度
     *
     * @param quality 商品质量满意度
     */
    public void setQuality(String quality) {
        this.quality = quality;
    }

    /**
     * 获取加油站工作效率和油品标号满意度
     *
     * @return oils - 加油站工作效率和油品标号满意度
     */
    public String getOils() {
        return oils;
    }

    /**
     * 设置加油站工作效率和油品标号满意度
     *
     * @param oils 加油站工作效率和油品标号满意度
     */
    public void setOils(String oils) {
        this.oils = oils;
    }

    /**
     * 获取免费热水满意度
     *
     * @return hot_water - 免费热水满意度
     */
    public String getHotWater() {
        return hotWater;
    }

    /**
     * 设置免费热水满意度
     *
     * @param hotWater 免费热水满意度
     */
    public void setHotWater(String hotWater) {
        this.hotWater = hotWater;
    }

    /**
     * 获取信息查询设备满意度
     *
     * @return info_query - 信息查询设备满意度
     */
    public String getInfoQuery() {
        return infoQuery;
    }

    /**
     * 设置信息查询设备满意度
     *
     * @param infoQuery 信息查询设备满意度
     */
    public void setInfoQuery(String infoQuery) {
        this.infoQuery = infoQuery;
    }

    /**
     * 获取免费手机充电设备满意度
     *
     * @return phone_charge - 免费手机充电设备满意度
     */
    public String getPhoneCharge() {
        return phoneCharge;
    }

    /**
     * 设置免费手机充电设备满意度
     *
     * @param phoneCharge 免费手机充电设备满意度
     */
    public void setPhoneCharge(String phoneCharge) {
        this.phoneCharge = phoneCharge;
    }

    /**
     * 获取免费wifi信号覆盖满意度
     *
     * @return wifi - 免费wifi信号覆盖满意度
     */
    public String getWifi() {
        return wifi;
    }

    /**
     * 设置免费wifi信号覆盖满意度
     *
     * @param wifi 免费wifi信号覆盖满意度
     */
    public void setWifi(String wifi) {
        this.wifi = wifi;
    }

    /**
     * 获取客房满意度
     *
     * @return guest_room - 客房满意度
     */
    public String getGuestRoom() {
        return guestRoom;
    }

    /**
     * 设置客房满意度
     *
     * @param guestRoom 客房满意度
     */
    public void setGuestRoom(String guestRoom) {
        this.guestRoom = guestRoom;
    }

    /**
     * 获取无障碍通道满意度
     *
     * @return easy_channel - 无障碍通道满意度
     */
    public String getEasyChannel() {
        return easyChannel;
    }

    /**
     * 设置无障碍通道满意度
     *
     * @param easyChannel 无障碍通道满意度
     */
    public void setEasyChannel(String easyChannel) {
        this.easyChannel = easyChannel;
    }

    /**
     * 获取母婴室满意度
     *
     * @return baby_room - 母婴室满意度
     */
    public String getBabyRoom() {
        return babyRoom;
    }

    /**
     * 设置母婴室满意度
     *
     * @param babyRoom 母婴室满意度
     */
    public void setBabyRoom(String babyRoom) {
        this.babyRoom = babyRoom;
    }

    /**
     * 获取医联体满意度
     *
     * @return medical - 医联体满意度
     */
    public String getMedical() {
        return medical;
    }

    /**
     * 设置医联体满意度
     *
     * @param medical 医联体满意度
     */
    public void setMedical(String medical) {
        this.medical = medical;
    }

    /**
     * 获取司机之家满意度
     *
     * @return driver_home - 司机之家满意度
     */
    public String getDriverHome() {
        return driverHome;
    }

    /**
     * 设置司机之家满意度
     *
     * @param driverHome 司机之家满意度
     */
    public void setDriverHome(String driverHome) {
        this.driverHome = driverHome;
    }

    /**
     * 获取旅游咨询满意度
     *
     * @return travel - 旅游咨询满意度
     */
    public String getTravel() {
        return travel;
    }

    /**
     * 设置旅游咨询满意度
     *
     * @param travel 旅游咨询满意度
     */
    public void setTravel(String travel) {
        this.travel = travel;
    }

    /**
     * 获取特色商品示范店满意度
     *
     * @return model_shop - 特色商品示范店满意度
     */
    public String getModelShop() {
        return modelShop;
    }

    /**
     * 设置特色商品示范店满意度
     *
     * @param modelShop 特色商品示范店满意度
     */
    public void setModelShop(String modelShop) {
        this.modelShop = modelShop;
    }

    /**
     * 获取充电桩满意度
     *
     * @return charging_pile - 充电桩满意度
     */
    public String getChargingPile() {
        return chargingPile;
    }

    /**
     * 设置充电桩满意度
     *
     * @param chargingPile 充电桩满意度
     */
    public void setChargingPile(String chargingPile) {
        this.chargingPile = chargingPile;
    }

    /**
     * 获取投诉建议
     *
     * @return advice - 投诉建议
     */
    public String getAdvice() {
        return advice;
    }

    /**
     * 设置投诉建议
     *
     * @param advice 投诉建议
     */
    public void setAdvice(String advice) {
        this.advice = advice;
    }

    /**
     * 获取服务区编号
     *
     * @return area_no - 服务区编号
     */
    public String getAreaNo() {
        return areaNo;
    }

    /**
     * 设置服务区编号
     *
     * @param areaNo 服务区编号
     */
    public void setAreaNo(String areaNo) {
        this.areaNo = areaNo;
    }

    /**
     * 获取服务区名称
     *
     * @return area_name - 服务区名称
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * 设置服务区名称
     *
     * @param areaName 服务区名称
     */
    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    /**
     * 获取姓名
     *
     * @return u_name - 姓名
     */
    public String getuName() {
        return uName;
    }

    /**
     * 设置姓名
     *
     * @param uName 姓名
     */
    public void setuName(String uName) {
        this.uName = uName;
    }

    /**
     * 获取联系电话
     *
     * @return u_phone - 联系电话
     */
    public String getuPhone() {
        return uPhone;
    }

    /**
     * 设置联系电话
     *
     * @param uPhone 联系电话
     */
    public void setuPhone(String uPhone) {
        this.uPhone = uPhone;
    }

    /**
     * 获取服务区整体评价：1-非常差，2-比较差，3-一般，4-良好，5-非常好。
     *
     * @return star - 服务区整体评价：1-非常差，2-比较差，3-一般，4-良好，5-非常好。
     */
    public Byte getStar() {
        return star;
    }

    /**
     * 设置服务区整体评价：1-非常差，2-比较差，3-一般，4-良好，5-非常好。
     *
     * @param star 服务区整体评价：1-非常差，2-比较差，3-一般，4-良好，5-非常好。
     */
    public void setStar(Byte star) {
        this.star = star;
    }

    /**
     * 获取创建时间
     *
     * @return pb_date - 创建时间
     */
    public Date getPbDate() {
        return pbDate;
    }

    /**
     * 设置创建时间
     *
     * @param pbDate 创建时间
     */
    public void setPbDate(Date pbDate) {
        this.pbDate = pbDate;
    }

    /**
     * 获取修改时间
     *
     * @return up_date - 修改时间
     */
    public Date getUpDate() {
        return upDate;
    }

    /**
     * 设置修改时间
     *
     * @param upDate 修改时间
     */
    public void setUpDate(Date upDate) {
        this.upDate = upDate;
    }
}