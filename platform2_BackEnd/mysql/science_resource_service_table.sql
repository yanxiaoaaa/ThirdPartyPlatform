use science_resource;
create table service_table
(
    service_id                    int auto_increment
        primary key,
    service_name                  varchar(765)  not null,
    service_price                 varchar(765)  not null,
    service_charge                varchar(765)  null,
    service_means_of_payment      varchar(765)  null,
    service_field                 varchar(765)  null,
    service_desc                  varchar(2000) not null,
    service_procedure             varchar(2000) null,
    service_period                varchar(765)  null,
    service_acceptance            varchar(765)  null,
    service_way                   varchar(2000) null,
    service_location              varchar(765)  null,
    service_circumstance          varchar(765)  null,
    service_deliverable_name      varchar(765)  null,
    service_deliverable_type      varchar(765)  null,
    service_deliver_date          varchar(765)  null,
    service_deliverable_copyright varchar(765)  null,
    service_provider              varchar(765)  null,
    service_category              varchar(765)  null,
    service_picture               varchar(765)  null,
    server_id                     int           null,
    service_third_party_url       varchar(765)  null,
    create_time                   datetime      null
);

INSERT INTO science_resource.service_table (service_id, service_name, service_price, service_charge, service_means_of_payment, service_field, service_desc, service_procedure, service_period, service_acceptance, service_way, service_location, service_circumstance, service_deliverable_name, service_deliverable_type, service_deliver_date, service_deliverable_copyright, service_provider, service_category, service_picture, server_id, create_time) VALUES (1, '计量检测', '详询', null, null, null, '标准院依托赛西实验室开展电子产品、信息技术产品的认证检测、委托检测工作，承担电子信息产品质量控制和技术评价工作；组织开展试验方法和检测方法的研究、试验验证、试验对比对等技术活动；专项提供解决方案、试验设备和工装夹具的设计等服务。', null, '1个月', null, null, null, null, null, null, null, null, '中国赛西实验室', '专业化技术服务/检验、检测、标准、认证和计量服务', 'http://kaka2008.chinagazelle.cn/5312ca123c07b764aa00ee5f6c0722e8.jpg-w270h180', 1, '2021-04-14 18:04:04');
INSERT INTO science_resource.service_table (service_id, service_name, service_price, service_charge, service_means_of_payment, service_field, service_desc, service_procedure, service_period, service_acceptance, service_way, service_location, service_circumstance, service_deliverable_name, service_deliverable_type, service_deliver_date, service_deliverable_copyright, service_provider, service_category, service_picture, server_id, create_time) VALUES (2, '染色体异常检测', '详询', null, null, null, '染色体异常是导致自然流产、出生缺陷、先天性遗传疾病、不孕不育等的重要遗传因素。

安诺优达染色体异常检测结合新一代高通量测序（NGS）技术与生物信息分析方法，针对妊娠期流产/引产组织、胎儿绒毛/脐带血或受检者外周血样本进行全基因组测序，可为不明原因的自然流产寻找可能的遗传学因素，也可为具有不良生育史或疑似染色体异常症状人群查找染色体异常方面的原因。

本检测可覆盖23对染色体，检测精度最高可达0.1Mb。检测过程无需细胞培养，无需自建平台，检出率及特异性均在99%以上。检测内容包括全面检测人体23对染色体非整倍性异常以及0.1Mb以上的染色体缺失或重复突变，同时可以检测低至5%的嵌合体。', null, '一次性', null, null, null, null, null, null, null, null, '安诺优达基因科技（北京）有限公司', '专业化技术服务/检验、检测、标准、认证和计量服务', 'http://kaka2008.chinagazelle.cn/5312ca123c07b764aa00ee5f6c0722e8.jpg-w270h180', 1, '2021-04-14 18:04:04');
INSERT INTO science_resource.service_table (service_id, service_name, service_price, service_charge, service_means_of_payment, service_field, service_desc, service_procedure, service_period, service_acceptance, service_way, service_location, service_circumstance, service_deliverable_name, service_deliverable_type, service_deliver_date, service_deliverable_copyright, service_provider, service_category, service_picture, server_id, create_time) VALUES (3, '循环肿瘤DNA（ctDNA）检测', '详询', null, null, null, '    循环肿瘤DNA（circulating tumor DNA，ctDNA），是一种存在于血浆或血清、脑脊液等体液中的细胞外DNA，主要来自于坏死或凋亡的肿瘤细胞、肿瘤细胞分泌的外排体及循环肿瘤细胞，大小通常为160-180 bp。ctDNA是游离DNA（cell-free DNA，cfDNA）中的一类，所占比例较低（0.1%-1%之间），因此检测难度较大。二代测序（NGS）技术的成熟，提高了ctDNA检测的灵敏度和准确度，加速推进ctDNA检测应用于临床，协助医生进行个体化诊疗，为肿瘤患者的治疗带来极大的便利。

    循环肿瘤DNA（ctDNA）无创个体化诊疗基因检测，通过抽取外周血获取ctDNA进行测序，分析肿瘤药物相关基因变异情况，全面、准确解读肿瘤药物与基因的关联，为医生制定个体化用药诊疗方案提供帮助。


    循环肿瘤DNA检测特点

    1）取样方便：无创无损、实时多次、易获取

    ctDNA检测只需抽取血液即可完成对肿瘤细胞DNA的分析与解读，避免穿刺、手术等有创方式采集肿瘤组织的风险和痛苦。在恶性肿瘤发生早期，ctDNA含量和基因的异常改变就可以被检测到。ctDNA检测可以实现实时、多阶段、个体化诊疗服务。

    2）检测技术成熟：灵敏度高，准确度高，假阳性率低

    利用NGS检测ctDNA，灵敏准确，可检测到低至0. 1%的低频突变。Dawson等[1]在《新英格兰医学》发表的一项研究中指出：与其他类型的肿瘤标记物比较，ctDNA具有更高的敏感性，可以更早的反应肿瘤的进展情况和治疗效果。

    ctDNA携带有肿瘤患者的基因信息，定量或定性分析这些循环DNA对肿瘤的早期诊断、治疗、病情监测及预后的评价具有重要的临床价值。ctDNA检测能够为肿瘤个体化治疗呈现较全面的分子生物学特性，是一种理想的肿瘤标志物。

    3）检测全面：应用范围广

    几乎所有肿瘤细胞都可以将DNA片段释放到血液中，因此，ctDNA能够体现患者体内肿瘤的综合情况。临床上，ctDNA检测可应用于A） 肿瘤的早期诊断；B）监控肿瘤的演化和适应性改变；C）实时监控用药治疗效果，追踪肿瘤转归、转移和复发等；D）个性化的治疗方案指导。异质性对肿瘤组织基因检测影响较大，ctDNA检测可以避免因肿瘤组织异质性导致取样的随机性和局部性，使得肿瘤突变结果更全面、可靠。', null, '一次性', null, null, null, null, null, null, null, null, '安诺优达基因科技（北京）有限公司', '专业化技术服务/检验、检测、标准、认证和计量服务', 'http://kaka2008.chinagazelle.cn/5312ca123c07b764aa00ee5f6c0722e8.jpg-w270h180', 1, '2021-04-14 18:04:04');
INSERT INTO science_resource.service_table (service_id, service_name, service_price, service_charge, service_means_of_payment, service_field, service_desc, service_procedure, service_period, service_acceptance, service_way, service_location, service_circumstance, service_deliverable_name, service_deliverable_type, service_deliver_date, service_deliverable_copyright, service_provider, service_category, service_picture, server_id, create_time) VALUES (4, '产品测评', '详询', null, null, null, '对国内外信息技术产品的安全性进行测评，其中包括各类信息安全产品如防火墙、入侵监测、安全审计、网络隔离、VPN、智能卡、卡终端、安全管理等，以及各类非安全专用IT产品如操作系统、数据库、交换机、路由器、应用软件等。

根据测评依据及测评内容，分为：信息安全产品分级评估、信息安全产品认定测评、信息技术产品自主原创测评、源代码安全风险评估、选型测试、定制测试。', null, '1个月', null, null, null, null, null, null, null, null, '信息产业信息安全测评中心', '专业化技术服务/检验、检测、标准、认证和计量服务', 'http://kaka2008.chinagazelle.cn/5312ca123c07b764aa00ee5f6c0722e8.jpg-w270h180', 1, '2021-04-14 18:04:04');
INSERT INTO science_resource.service_table (service_id, service_name, service_price, service_charge, service_means_of_payment, service_field, service_desc, service_procedure, service_period, service_acceptance, service_way, service_location, service_circumstance, service_deliverable_name, service_deliverable_type, service_deliver_date, service_deliverable_copyright, service_provider, service_category, service_picture, server_id, create_time) VALUES (5, '渗透测试', '详询', null, null, null, '渗透测试是指在规范化的实施流程和风险规避手段的基础上，以入侵者的思维方式，利用渗透工具、攻击代码及溢出利用技术，模拟入侵者可能采用的攻击途径，发现被测系统在网络层、系统层和应用层存在的安全漏洞及深层次安全隐患，为系统的安全整改和加固提供参考依据。

渗透测试是等级测评工作的重要环节，是等级符合性检验与风险评估的有效补充，等级测评属于合规性检验，渗透测试是从专业角度深入用户信息系统，以入侵者的思维对被测系统进行深度识别，发现信息系统存在的漏洞和潜在安全弱点，渗透测试从工程化角度帮助信息系统实际提升信息安全保障水平。

渗透测试服务适用于有以下需求的单位及企业：

单位网站是否有被篡改的可能；
系统是否存在被攻击者利用的漏洞；
了解单位目前安全体系还存在哪些隐患及安全防护能力实际情况；
在制定单位信息系统建设与整改投资方面需要详实数据依据；
单位核心业务及上级领导高度重视的信息系统安全防护措施有效性；
信息系统建设与整改后的安全效果是否满足了防护要求。

通过渗透测试识别用户应用系统所存在的安全漏洞与所面临的安全问题，通过进一步的安全加固技术手段消除存在的安全漏洞，提升信息系统应用安全的防护能力。
掌握应用系统的安全防护现状；
识别系统层与应用层存在的安全风险与漏洞。

输出成果：《渗透测试报告》', null, '1个月', null, null, null, null, null, null, null, null, '北京华电卓识信息安全测评技术中心有限公司', '专业化技术服务/检验、检测、标准、认证和计量服务', 'http://kaka2008.chinagazelle.cn/5312ca123c07b764aa00ee5f6c0722e8.jpg-w270h180', 1, '2021-04-14 18:04:04');
INSERT INTO science_resource.service_table (service_id, service_name, service_price, service_charge, service_means_of_payment, service_field, service_desc, service_procedure, service_period, service_acceptance, service_way, service_location, service_circumstance, service_deliverable_name, service_deliverable_type, service_deliver_date, service_deliverable_copyright, service_provider, service_category, service_picture, server_id, create_time) VALUES (6, '等级测评', '详询', null, null, null, '等级测评即等级符合性检验是等级测评工作中的核心环节，通过检测、评估信息系统安全状况，识别用户信息系统的安全保护能力与国家等级保护要求之间的安全等级差距，为信息系统的建设、整改、检查与监督工作提供依据。

信息系统安全等级测评是整个信息系统安全等级保护工作的重要环节。《信息安全等级保护管理办法》（公通字[2007]43号）第十四条指出“信息系统建设完成后，运营、使用单位或者其主管部门应当选择符合本办法规定条件的测评单位，依据《信息系统安全等级保护测评要求》等技术标准，定期对信息系统安全等级状况开展等级测评，第三级信息系统应当每年至少进行一次等级测评，第四级信息系统应当每半年至少进行一次等级测评，第五级信息系统应当依据特殊安全需求进行等级测评。信息系统运营、使用单位及其主管部门应当每年至少进行一次自查，第四级信息系统应当每半年至少进行一次自查，第五级信息系统应当依据特殊安全需求进行自查。经测评或自查，信息系统安全状况未达到安全保护等级要求的，运用、使用单位应当指定方案进行整改。” 同时，用户单位在办理信息系统安全保护等级备案手续时，第三级及以上信息系统应当同时提供测评后符合系统安全保护等级的技术测评报告。

通过等级测评服务可以判定信息系统的安全状态是否符合等级保护相应等级的安全要求，是否达到了与其安全等级相适应的安全防护能力。通过对信息系统等级符合性检验，最终出具等级测评报告，可以帮助用户发现信息系统的安全防护能力与国家等级保护要求之间的差距，指导用户下一步的具体安全建设、整改工作，最终使系统达到国家等级保护的相关要求，避免相关安全风险事件的发生。
输出成果：《信息系统安全等级测评报告》
测评依据：
GB17859-1999《计算机信息系统安全保护等级划分准则》
GB/T 22239-2008《信息安全技术 信息系统安全等级保护 基本要求》
GB/T 22240-2008《信息安全技术 信息系统安全保护等级 定级指南》
《信息安全技术 信息系统安全等级保护测评要求》（国标报批稿）
《信息安全技术 信息系统安全等级保护测评过程指南》（国标送审稿）', null, '1个月', null, '　　等级测评涉及三种基本测评工作方式：访谈、检查和测试。 一、访谈 　　是测评人员通过与信息系统有关人员进行交流、讨论等活动，获取证据以证明信息系统安全保护措施是否有效的一种方法。管理上的要求主要使用访谈方法进行测评。 二、检查 　　是指测评人员通过对测评对象进行观察、查验、分析等活动，获取证据以证明信息系统安全保护措施是否有效的一种方法。检查的范围一般要覆盖测评项中所有要求的内容。 三、测试 　　是测评人员使用预定的方法/工具使测评对象产生特定的行为，通过查看、分析这些行为的结果，获取证据以证明信息系统安全保护措施是否有效的一种方法。测试方法主要用于验证信息系统当前的、具体的安全机制以及运行的配置和实现情况的有效性或安全强度。', null, null, null, null, null, null, '北京华电卓识信息安全测评技术中心有限公司', '专业化技术服务/检验、检测、标准、认证和计量服务', 'http://kaka2008.chinagazelle.cn/5312ca123c07b764aa00ee5f6c0722e8.jpg-w270h180', 1, '2021-04-14 18:04:04');
INSERT INTO science_resource.service_table (service_id, service_name, service_price, service_charge, service_means_of_payment, service_field, service_desc, service_procedure, service_period, service_acceptance, service_way, service_location, service_circumstance, service_deliverable_name, service_deliverable_type, service_deliver_date, service_deliverable_copyright, service_provider, service_category, service_picture, server_id, create_time) VALUES (7, '软件产品性能测试', '详询', null, null, null, '验证软件系统是否能够达到用户提出的性能指标，同时发现软件系统中存在的性能瓶颈，优化软件，最后起到优化系统的目的。

主要体现在：

评估系统能力；

识别体系中的弱点

系统调优；

验证稳定性可靠性。

性能测试主要包括：

1、性能瓶颈分析：网络状况、硬件设备、系统/应用服务器/数据库配置、数据库设计和数据库访问实现方式、业务的程序实现等；

2、性能调优：CPU问题、内存和高速缓存、磁盘（I/O）资源问题、调整配置参数、优化应用系统以及网络设置', '测试需求沟通
项目需求明确
合同起草
合同评审
合同签订
项目启动
测试需求分析
测试计划编制
测试计划评审
搭建测试环境
测试计划实践
测试用例评审
测试执行
回归测试执行
缺陷确认
测试报告编制
测试报告评审
测试报告发放', '5-15个工作日', '依据客户需求交付测试报告。', '现场真实环境测试/搭建模拟环境进行测试/其它测试环境进行测试。', '客户现场/测试机构机房/开发方开发环境/其它测试服务地点。', '客户提供项目所需文档材料、适宜的测试环境、被测试软件、性能测试指标和必要的技术支持。', '《测试报告》', '报告（纸质）', '项目工作完成后一周内', null, null, '专业化技术服务/检验、检测、标准、认证和计量服务', 'http://kaka2008.chinagazelle.cn/5312ca123c07b764aa00ee5f6c0722e8.jpg-w270h180', null, '2021-04-14 18:04:04');
INSERT INTO science_resource.service_table (service_id, service_name, service_price, service_charge, service_means_of_payment, service_field, service_desc, service_procedure, service_period, service_acceptance, service_way, service_location, service_circumstance, service_deliverable_name, service_deliverable_type, service_deliver_date, service_deliverable_copyright, service_provider, service_category, service_picture, server_id, create_time) VALUES (8, '信息安全等级保护测试', '按应用系统的个数来计算，一套应用系统参考价格为12万左右', null, null, null, '信息系统安全等级测评是一种符合性测试，确定信息系统是否符合国家的信息安全等级要求。信息系统安全等级测评主要检测和评估信息系统在安全技术、安全管理等方面是否符合已确定的安全等级的要求；对于尚未符合要求的信息系统，分析和评估其潜在威胁、薄弱环节以及现有安全防护措施，综合考虑信息系统的重要性和面临的安全威胁等因素，提出相应的整改建议，并在系统整改后进行复测确认，以确保信息系统的安全保护措施符合相应安全等级的基本安全要求。

测试内容：

技术安全测评：包括物理安全、网络安全、主机安全、数据安全、应用安全；

管理安全测评：包括安全管理制度、安全管理机构、人员安全管理、系统建设管理、系统运维管理；

综合测评：包括安全控制间安全测评、层面间安全测评、区域间安全测评、系统结构安全测评。', '1、申请受理：沟通测试需求、签署《保密协议》、签署合同；2、编写信息安全等级测评方案；3、现场检测、系统运行情况验证；4、编制测评检查报告、整改复测；5、三级（含）以上系统专家评审；6、报告审批/发送；7、交付测试报告', '15-20个工作日', '交付测试报告', '现场真实环境测试/搭建模拟环境进行测试/其它测试环境进行测试', '客户现场/测试机构机房/开发方开发环境/其它测试服务地点', '客户提供《信息系统安全等级测评申请书》、软件验收指标要求、需求说明文件、软件测试环境以及必要的技术支持', '《信息系统安全等级测评方案》、《信息系统安全等级保护测评项目报告书》、《现场检测表》、《信息系统安全等级核查测试报告》、《信息系统等级测评整改报告》、《信息系统安全等级测评复测记录表》、《信息系统安全等级测评报告》等', '报告', '项目工作完成后一周内', '归属服务机构和客户所有', null, '专业化技术服务/检验、检测、标准、认证和计量服务', 'http://kaka2008.chinagazelle.cn/5312ca123c07b764aa00ee5f6c0722e8.jpg-w270h180', null, '2021-04-14 18:04:04');
INSERT INTO science_resource.service_table (service_id, service_name, service_price, service_charge, service_means_of_payment, service_field, service_desc, service_procedure, service_period, service_acceptance, service_way, service_location, service_circumstance, service_deliverable_name, service_deliverable_type, service_deliver_date, service_deliverable_copyright, service_provider, service_category, service_picture, server_id, create_time) VALUES (9, '商标代理', '1000元起', '按件收费（不含官费）', '一次性支付', '适用所有行业', '商标注册是法人或其他组织对其生产、制造、加工、拣选或经销的商品或者提供的服务需要取得商标专用权的，应当依法向国家工商行政管理总局商标局（以下简称商标 局）提出商标注册申请。商标注册实行申请在先原则，申请日期的确立对商标注册能否成功至关重要。

  在知识经济快速发展的今天，知识产权已逐步成为企业发展的重要财富，随着全球知识产权事业的快速发展。我国企业也应当逐步与世界接轨，制定和发展企业知识产权战略，使知识产权成为企业在市场竞争中的有力武器。好的产品、带动好的市场，好的产权保护，提升企业的价值。


    海虹嘉诚把从事知识产权服务当作一种荣誉和责任，持之以恒地坚持高品质的服务，竭尽全力为客户打好知识产权的坚实基础。选择海虹嘉诚，专业、诚信、高效的服务，让您选择一次，受益终身！', '1、提供咨询并制定服务方案，建立合作关系，签订《委托代理协议》并付款
2、申请前查询、判断注册风险，出具查询报告
3、告知企业需要准备的资料
4、提交申请
5、领取证书。', '14-16个月', '客户取得商标注册证，完成资料交付。', null, '北京，全国范围内提供服务', '客户提供材料：

公司法人名义：营业执照复印件、清晰的商标标识、申请书、委托书。

个体个人名义：身份证复印件、个体工商户营业执照复印件、清晰的商标标识、申请书、委托书。', '商标注册证', '证书', '根据客户服务方案，服务周期内交付', '归属客户所有', '北京海虹嘉诚知识产权代理有限公司', '科技推广及相关服务/知识产权服务', 'http://kaka2008.chinagazelle.cn/33cbcd6e345e9a7c2cc539b6e0f97194.jpg-w270h180', null, '2021-04-14 18:04:04');
INSERT INTO science_resource.service_table (service_id, service_name, service_price, service_charge, service_means_of_payment, service_field, service_desc, service_procedure, service_period, service_acceptance, service_way, service_location, service_circumstance, service_deliverable_name, service_deliverable_type, service_deliver_date, service_deliverable_copyright, service_provider, service_category, service_picture, server_id, create_time) VALUES (10, '专利申请代理', '6000起', '按阶段收费或全包付费（不含官费）', '一次性支付', '适用所有行业', '专利分为发明专利、实用新型专利、外观设计专利。
    专利是专利权的简称，指专利权人对发明创造享有的专利权，即国家依法在一定时期内授予发明创造者或者其权利继受者独占使用其发明创造的权利，这里强调的是权利。专利权是一种专有权，这种权利具有独占的排他性。非专利权人要想使用他人的专利技术，必须依法征得专利权人的授权或许可。

    在知识经济快速发展的今天，知识产权已逐步成为企业发展的重要财富，随着全球知识产权事业的快速发展。我国企业也应当逐步与世界接轨，制定和发展企业知识产权战略，使知识产权成为企业在市场竞争中的有力武器。好的产品、带动好的市场，好的产权保护，提升企业的价值。

    海虹嘉诚把从事知识产权服务当作一种荣誉和责任，持之以恒地坚持高品质的服务，竭尽全力为客户打好知识产权的坚实基础。选择海虹嘉诚，专业、诚信、高效的服务，让您选择一次，受益终身！', '1、提供咨询并制定服务方案，确认申请类型及数量，建立合作关系，签订《委托代理协议》及保密协议并付款
2、（根据客户需求）申请前检索
3、撰写文件
4、提交申请
5、受理--审查-授权
6、领取证书', '0.8-2.5年', '客户取得专利证书，完成资料交付', null, '北京，全国范围内提供服务', '客户提供材料：
1、技术交底
2、委托书
3、其他（登记表、费减备案编号等）', '专利证书', null, '根据客户服务方案，服务周期内交付', '归属客户所有', '北京海虹嘉诚知识产权代理有限公司', '科技推广及相关服务/知识产权服务', 'http://kaka2008.chinagazelle.cn/fcde07ca3641f7ee48d799008ec34ea2.jpg-w270h180', null, '2021-04-14 18:04:04');
INSERT INTO science_resource.service_table (service_id, service_name, service_price, service_charge, service_means_of_payment, service_field, service_desc, service_procedure, service_period, service_acceptance, service_way, service_location, service_circumstance, service_deliverable_name, service_deliverable_type, service_deliver_date, service_deliverable_copyright, service_provider, service_category, service_picture, server_id, create_time) VALUES (11, '软件著作权加急代理', '1000元起', null, null, null, '计算机软件著作权保护的主要是一种产权的保护。
    作为知识产权的一种类别，计算机软件著作权区别于专利，在于它保护的是版权。主要保护对象是代码化指令序列、符号化语句序列及其有关文档。

       申请计算机软件著作权保护对企业非常有必要，一方面便于产品的推广和销售，另一方面有助于后期申请资质、补贴、体现企业实力、保护企业的无形资产。另外申请计算机软件著作权保护的时间和难度相对于专利难度较小，只需要提供基本资料，最后在您指定的时间拿到证书。

    海虹嘉诚把从事知识产权服务当作一种荣誉和责任，持之以恒地坚持高品质的服务，竭尽全力为客户打好知识产权的坚实基础。 好的产品、带动好的市场，好的产权保护，提升企业的价值。选择海虹嘉诚，专业、诚信、高效的服务，让您选择一次，受益终身！

      注：海虹嘉诚软著申请分普通和加急服务', '1、提供咨询并制定服务方案，建立合作关系，签订《委托代理协议》并付款；

2、告知企业需要准备的资料；

3、网上申请、软件说明文档和源代码的整理工作；

4、与客户确认，准备签章文件；

5、在指定的时间完成申报，交费

6、领取证书。', '5-33日', '客户取得软件著作权证书，完成资料交付', null, '北京，全国范围内提供服务', null, null, '证书', '根据客户服务方案，服务周期内交付', '归属客户所有', '北京海虹嘉诚知识产权代理有限公司', '科技推广及相关服务/知识产权服务', 'http://kaka2008.chinagazelle.cn/8e200eeaceee6d985ab1f1c52a50d804.jpg-w270h180', null, '2021-04-14 18:04:04');
INSERT INTO science_resource.service_table (service_id, service_name, service_price, service_charge, service_means_of_payment, service_field, service_desc, service_procedure, service_period, service_acceptance, service_way, service_location, service_circumstance, service_deliverable_name, service_deliverable_type, service_deliver_date, service_deliverable_copyright, service_provider, service_category, service_picture, server_id, create_time) VALUES (12, '商标注册', '1500', '依据国内、国外商标等不同类型，或者不同行业收费亦同', '一次性支付', '适用于全部行业', '商标是商品的生产者、经营者在其生产、制造、加工、拣选或者经销的商品上或者服务的提供者在其提供的服务上采用的，用于区别商品或服务来源的，由文字、图形、字母、数字、三维标志、声音、颜色组合，或上述要素的组合，具有显著特征的标志，是现代经济的产物。在商业领域而言，商标包括文字、图形、字母、数字、三维标志和颜色组合，以及上述要素的组合，均可作为商标申请注册。经国家核准注册的商标为"注册商标"，受法律保护。商标通过确保商标注册人享有用以标明商品或服务，或者许可他人使用以获取报酬的专用权，而使商标注册人受到保护。', '商标注册代理主要包括：

商标注册检索：查询是否有相同商标已经注册；
当时提交申请；
进行初审，七日内电子回函；
实质审核，6-8个月年度审查，通过后发布公告；
公告3个月；
无异议发布证书', '9-12个月', '客户验收', '客户一对一服务方式', '商标注册所需资料', '《商标注册受理通知书》 《商标注册证书》', null, '资质文件', '9-12个月', '归客户所有', '盈泰（北京）商务服务有限公司 ', '科技推广及相关服务/知识产权服务', 'http://kaka2008.chinagazelle.cn/783fb661b8db40d8ede221ca5c576638.jpg-w270h180', null, '2021-04-14 18:04:04');
INSERT INTO science_resource.service_table (service_id, service_name, service_price, service_charge, service_means_of_payment, service_field, service_desc, service_procedure, service_period, service_acceptance, service_way, service_location, service_circumstance, service_deliverable_name, service_deliverable_type, service_deliver_date, service_deliverable_copyright, service_provider, service_category, service_picture, server_id, create_time) VALUES (13, '知识产权贯标', '面议', null, null, null, '贯标”就是贯彻《企业知识产权管理规范》国家标准。企业知识产权管理规范的国家标准由国家知识产权局制订，经由国家质量监督检验检疫总局、国家标准化管理委员会批准颁布，于2013年3月1日起实施，标准号为GB/T29490-2013。', '序号

工作流程

超凡辅导内容

1

贯标工作筹备

（1）与企业洽谈，签订贯标服务合同

（2）成立贯标辅导小组

（3）指导企业召开贯标工作启动会

（4）协助企业开展标准培训

2

调查诊断

（1）与各部门相关人员座谈，查阅企业相关制度文件、记录文件

（2）分析调查情况，形成诊断报告

3

构建知识产权管理体系

（1）指导企业制定知识产权方针、目标

（2）协助企业设置知识产权管理机构、明确管理职责和权限

4

编制知识产权管理文件

（1）帮助企业规划文件系统，开列主要文件清单

（2）协助企业编写知识产权管理文件

5

知识产权管理文件会审

（1）比较知识产权管理文件是否符合《规范》的要求

（2）审查知识产权管理文件是否具有适宜性，并进行有效性预测

6

文件发放、实施培训

（1）推动企业知识产权管理文件在企业内部颁布

（2）协助企业进行分级培训

7

实施运行

（1）指导各部门按程序运行

（2）指导各部门形成知识产权活动记录

（3）协助企业解决运行中出现的问题

8

内部审核与管理评审

（1）指导企业进行内部审核

（2）指导企业实施管理评审

（3）协助企业纠正内审和管评发现的问题

9

认证

（1）协助企业准备认证申请材料

（2）协助企业进行文审和现场审核不符合项整改', '12-18个月', null, null, null, null, null, null, null, null, '北京超凡知识产权代理有限公司', '科技推广及相关服务/知识产权服务', null, null, '2021-04-14 18:04:04');
INSERT INTO science_resource.service_table (service_id, service_name, service_price, service_charge, service_means_of_payment, service_field, service_desc, service_procedure, service_period, service_acceptance, service_way, service_location, service_circumstance, service_deliverable_name, service_deliverable_type, service_deliver_date, service_deliverable_copyright, service_provider, service_category, service_picture, server_id, create_time) VALUES (14, '知识产权法律案件', '详询', null, null, null, '超凡始创于2002年，是一家经中华人民共和国国务院主管部门批准的具有国内外专利、商标、版权代理资格的一站式全产业链知识产权服务机构。经过多年的发展，超凡已成为中国领先的综合性知识产权服务机构之一，在众多知识产权服务领域中处于行业的最前沿。2015年8月13日，超凡知识产权服务股份有限公司在全国中小企业股份转让系统成功挂牌（股票代码：833183），成为知识产权服务第一股。', null, '未知', null, null, null, null, null, null, null, null, '北京超凡知识产权代理有限公司', '科技推广及相关服务/知识产权服务', null, null, '2021-04-14 18:04:04');
INSERT INTO science_resource.service_table (service_id, service_name, service_price, service_charge, service_means_of_payment, service_field, service_desc, service_procedure, service_period, service_acceptance, service_way, service_location, service_circumstance, service_deliverable_name, service_deliverable_type, service_deliver_date, service_deliverable_copyright, service_provider, service_category, service_picture, server_id, create_time) VALUES (15, '版权代理申请', '详询', null, null, null, '超凡始创于2002年，是一家经中华人民共和国国务院主管部门批准的具有国内外专利、商标、版权代理资格的一站式全产业链知识产权服务机构。经过多年的发展，超凡已成为中国领先的综合性知识产权服务机构之一，在众多知识产权服务领域中处于行业的最前沿。2015年8月13日，超凡知识产权服务股份有限公司在全国中小企业股份转让系统成功挂牌（股票代码：833183），成为知识产权服务第一股。', null, '未知', null, null, null, null, null, null, null, null, '北京超凡知识产权代理有限公司', '科技推广及相关服务/知识产权服务', null, null, '2021-04-14 18:04:04');
INSERT INTO science_resource.service_table (service_id, service_name, service_price, service_charge, service_means_of_payment, service_field, service_desc, service_procedure, service_period, service_acceptance, service_way, service_location, service_circumstance, service_deliverable_name, service_deliverable_type, service_deliver_date, service_deliverable_copyright, service_provider, service_category, service_picture, server_id, create_time) VALUES (16, '知识产权运营', '详询
', null, null, null, '华智知识产权通过专业的知识产权律师和别具匠心的知识产权经营理念来为客户量身定制最合适的经营模式和国际化的经营策略，协助客户实现知识产权无形财富的有效增值。已经和多个国外的专利咨询机构、律师事务所建立了良好的合作关系，可为客户提供更多服务途径和服务方式，以满足客户的多样化需求。

通过对客户所拥有知识产权的价值和市场进行有效评估，协助客户进行知识产权许可市场的开拓、无形资产转让的达成以及知识产权国际贸易的实现。——知识产权许可、转让、贸易

协助客户进行知识产权的质押贷款、银行融资等金融代理服务，同时也协助客户进行投资前的知识产权调查以确保投资资金的安全，另外，还为客户提供以知识产权作为入股条件的投资行为提供咨询建议和方案。——知识产权质押、融资、投资

代理客户进行知识产权的对外谈判工作;在必要的情况下，可与客户签署保密协议，以我们(或者第三方)的名义对客户的目标对手提起法律诉讼和专利无效等工作，协助客户有效地实现自己的战略意图。——代理谈判、保密诉讼、专利无效', null, '1个月', null, null, null, null, null, null, null, null, '北京华智大为科技有限公司', '科技推广及相关服务/知识产权服务', null, null, '2021-04-14 18:04:04');
INSERT INTO science_resource.service_table (service_id, service_name, service_price, service_charge, service_means_of_payment, service_field, service_desc, service_procedure, service_period, service_acceptance, service_way, service_location, service_circumstance, service_deliverable_name, service_deliverable_type, service_deliver_date, service_deliverable_copyright, service_provider, service_category, service_picture, server_id, create_time) VALUES (17, '知识产权战略和管理咨询', '详询', null, null, null, '基于团队成员多年的具体实践和不断升华提炼，华智大为知识产权为用户提供既满足与企业具体实际需求，有结合业务内先进标杆企业成功经验的专业知识产权管理咨询和知识产权战略咨询服务。自成立以来，已为客户提供了近百套知识产权的整体解决方案。包括：

知识产权战略咨询

专利部署战略规划

专利运营战略规划

专利风险预警规划

专利、商标、著作权等联合战略规划

知识产权战略实施

......

知识产权管理咨询

知识产权管理制度、机制、体系建设

企业知识产权整体培训

专利产出激发机制

企业专利运动规划

知识产权工作流程设计

专利挖掘

......

其他

驰名商标认定

回避设计

研发指导

......', null, '1个月', null, null, null, null, null, null, null, null, '北京华智大为科技有限公司', '科技推广及相关服务/知识产权服务', null, null, '2021-04-14 18:04:04');
INSERT INTO science_resource.service_table (service_id, service_name, service_price, service_charge, service_means_of_payment, service_field, service_desc, service_procedure, service_period, service_acceptance, service_way, service_location, service_circumstance, service_deliverable_name, service_deliverable_type, service_deliver_date, service_deliverable_copyright, service_provider, service_category, service_picture, server_id, create_time) VALUES (18, '专利服务', '详询', null, null, null, '通过对目标专利文献群进行精确全面的检索、分类、解读和分析，挖掘隐藏在专利中的技术情报和商业情报，从而为客户的产品研发、市场开拓、竞争策略和知识产权战略提供数据参考和有针对性的决策建议。包括：

新产品上市前的专利风险分析：对于拟在某些特定市场(中国、美国、欧盟、新兴市场等)上市的新产品，基于该产品的技术方案进行检索，给出该产品是否存在侵权风险的结论，并给出相应的建议。

竞争对手专利布局分析：对某产品领域的主要竞争对手在全球的专利布局进行分析，从而理清主要竞争对手的专利布局特点，研究其技术发展路线图，并预测技术发展趋势，对热点技术、重要技术进行分析，从而给出相应的研发建议。

专利壁垒稳定性分析：对在专利风险分析过程中发现的重要授权有效专利的权利要求进行检索和分析，从而给出关于该权利要求是否稳定的结论，为企业的后续研发做参考。

自由公知技术检索分析：在某些特定的技术领域(如半导体、芯片技术、药品等)，存在大量的失效专利和未进入某个国家的专利，通过检索该特定领域的专利文献，从而为企业后续研发过程中选择研发路线给出建议。一方面可以避免专利侵权风险，另一方面还可以节省研发支出的费用。

华智大为专业可信的知识产权服务团队能为您提供快速、全面的检索方案。为确保您在市场的位置：我们提供全方位的检索服务包括先前技术、自由经营、有效性及侵权分析、最先技术、竞争情报等内容。为获取可信赖的结果：我们拥有经验丰富的专家，包括专利代理人和专利审查员。并且通过检索世界上最可靠的专利与非专利数据，让您的知识产权决策更自信。

通过对目标专利在技术层面、专利层面、商业应用和市场化等各方面的综合价值进行专业和独特的分析评估，协助客户有效地发现对自己有价值或有威胁的专利文件，发现行业出现的新兴技术、寻找合作伙伴，确定研究战略和发展方向提供有价值的依据。', null, '1个月', null, null, null, null, null, null, null, null, '北京华智大为科技有限公司', '科技推广及相关服务/知识产权服务', null, null, '2021-04-14 18:04:04');
INSERT INTO science_resource.service_table (service_id, service_name, service_price, service_charge, service_means_of_payment, service_field, service_desc, service_procedure, service_period, service_acceptance, service_way, service_location, service_circumstance, service_deliverable_name, service_deliverable_type, service_deliver_date, service_deliverable_copyright, service_provider, service_category, service_picture, server_id, create_time) VALUES (19, '认证服务', '详询', null, null, null, '北京赛西认证有限责任公司是经国家认证认可监督管理委员会批准成立的站也行认证机构。成立于1994年，是我国成立最早的认证机构之一。为信息产业和工业领域质量管理、信息安全、职业健康安全、节能减排和产品技术进步做出了积极的努力。

体系认证
  GB/T19001 ISO9001 质量管理体系
  GB/T24001 ISO14001 环境管理体系
  GB/T28001 QHSAS18001 职业健康安全管理体系
  GB/T22080 ISO/IEC27001 信息安全管理体系
  GB/T24405 ISO/IEC20000 信息技术服务管理体系
  GB/T23331   能源管理体系
    ISO14064-1 温室气体盘查
产品认证
IT类产品：中文特性认、会计核算数据接口认证、中文字型认证、Linux操作系统认证、闪联产品认证 数字电视产品：数字电视清晰度、机卡分离、地面接收认证
ROHS类产品
电子产品部件
产品碳足迹

服务认证
专业从事CMMI和SPCA评估、IT服务管理、ITIL培训机构和培训师认证及考试的第三方机构

检查
开展电子信息产品强制性产品认证工厂质量体系能力审查、自愿性产品认证工厂质量保证能力审查和综合布线的现场审查和项目验收等业务', null, '1个月', null, null, null, null, null, null, null, null, '中国电子技术标准化研究院', '科技推广及相关服务/知识产权服务', null, null, '2021-04-14 18:04:04');
INSERT INTO science_resource.service_table (service_id, service_name, service_price, service_charge, service_means_of_payment, service_field, service_desc, service_procedure, service_period, service_acceptance, service_way, service_location, service_circumstance, service_deliverable_name, service_deliverable_type, service_deliver_date, service_deliverable_copyright, service_provider, service_category, service_picture, server_id, create_time) VALUES (20, 'P2P解决方案', '详询', null, null, null, 'P2P行业背景概述

P2P网络借贷平台，是P2P借贷与网络借贷相结合的金融服务网站，这种新型的理财模式已逐渐被身处网络时代的大众所接受，一方面投资人实现了资产的收益增值，另一方面借款人则可以用这种方便快捷地方式满足自己的资金需求。

由于无监管、无门槛、无标准导致P2P行业混乱不堪、良莠不齐，造成整个网贷市场的挤兑、骗贷、崩盘、跑路等情况，与此同时在经历了2013年11月份的P2P倒闭风波后，行业内外关于P2P监管等消息不断。2014年1月7日《关于加强影子银行监管有关问题的通知》（107号文）将P2P行业归入影子银行的“大家庭”，并在监管责任分工中指出：“第三方理财和非金融机构资产证券化、网络金融活动等，由人民银行会同有关部门共同研究制定办法”，至此一直野蛮生长的P2P网贷似乎终于有了获取“户口本”的迹象。
P2P平台安全需求分析

?  身份真实性：出借人/借款人登录平台时，对身份的真实性验证

?  电子协议机密性：电子协议在传输过程中的机密性，保障出借人/借款人的敏感信息

?  电子协议真实性：电子协议签署前后内容的真实性，不可篡改性

?  操作行为抗抵赖性：签约双方，即出借人/借款人操作行为的不可抵赖性

?  电子签约合法合规性：电子协议的合法合规性

?  电子签章需求：电子签名可视化需求

解决方案
天诚安信的母公司天威诚信是自《电子签名法》颁布后，首批拿到《电子认证服务许可证》资质的第三方CA公司之一，其所发放的数字证书所做电子签名，完全符合《电子签名法》。同时天诚安信结合在P2P行业、其他金融行业中的经验和教训，为P2P行业设计的CA安全方案如下：



?  以 PKI/CA技术为基础，通过国家授权的第三方电子认证机构——天威诚信为借款人、投资人、担保公司、P2P平台运营商等发放等个数字证书、企业数字证书，建立身份的标识，实现强身份认证

?  在P2P平台中集成RAAPI，实现嵌入式RA，在P2P平台中进行证书生命周期管理，提高用户体验，方便P2P运营商对证书的管理；

?  在P2P平台中集成证书应用中间件ESA，可在登录、电子协议签署、转账时实现强身份认证、资金安全、电子协议合法合规性；

?  在P2P平台中集成电子签章组件，实现电子协议电子签名可视化，提高用户体验；

?  可为P2P平台发放全球服务器证书，防止钓鱼网站，同时可建立加密通道。', null, '1个月', null, null, null, null, null, null, null, null, '北京天诚安信科技有限公司', '科技金融服务', null, null, '2021-04-14 18:04:04');
INSERT INTO science_resource.service_table (service_id, service_name, service_price, service_charge, service_means_of_payment, service_field, service_desc, service_procedure, service_period, service_acceptance, service_way, service_location, service_circumstance, service_deliverable_name, service_deliverable_type, service_deliver_date, service_deliverable_copyright, service_provider, service_category, service_picture, server_id, create_time) VALUES (21, '展翼贷', '信用额度最高1000万元', null, null, '（1）新一代信息技术；（2）软件开发；（3）高端制造业；（4）节能环保；（5）生物医药； （6）新材料、新能源；（7）新型农业', '一、产品定位：处于成熟初期且已在新三板挂牌进行做市交易的中小企业

二、适用行业： （1）新一代信息技术；（2）软件开发；（3）高端制造业；（4）节能环保；（5）生物医药；（6）新材料、新能源；（7）新型农业

三、基本要求：（1）企业本年销售收入同比增长率不低于20%或利润增长率不低于10%；（2）不超过个人连带资产线索市值；（3）不超过企业净资产；（4）本次授信加已有授信额度不超过其月均收入的3倍

四、 反担保：新三板股票质押，质押率不超过30%，以最近1年内的市场平均成交价格为基准。

五、授信额度：信用额度最高1000万元', null, '未知', null, null, null, null, null, null, null, null, '北京银行清华园支行', '科技金融服务', 'http://kaka2008.chinagazelle.cn/ab55bc55e064a5215802381ed3a59a80.jpg-w270h180', null, '2021-04-14 18:04:04');
INSERT INTO science_resource.service_table (service_id, service_name, service_price, service_charge, service_means_of_payment, service_field, service_desc, service_procedure, service_period, service_acceptance, service_way, service_location, service_circumstance, service_deliverable_name, service_deliverable_type, service_deliver_date, service_deliverable_copyright, service_provider, service_category, service_picture, server_id, create_time) VALUES (22, '加速贷', '信用额度最高500万元', null, null, '（1）新一代信息技术；（2）软件开发；（3）高端制造业；（4）节能环保；（5）生物医药； （6）新材料、新能源；（7）新型农业', '一、产品定位：处于成长期的科技型中小企业

二、适用行业：（1）新一代信息技术；（2）软件开发；（3）高端制造业；（4）节能环保；（5）生物医药； （6）新材料、新能源；（7）新型农业

三、基本要求：（1）企业本年销售收入同比增长率不低于20%或利润增长率不低于10%；（2）不超过个人连带资产线索市值；（3）不超过企业净资产；（4）本次授信加已有授信额度不超过其月均收入的3倍

四、评审特点：侧重企业所在行业发展、自身竞争优势、发展潜力

五、授信额度：信用额度最高500万元', null, '未知', null, null, null, null, null, null, null, null, '北京银行清华园支行', '科技金融服务', 'http://kaka2008.chinagazelle.cn/ab0a39fed70a038b3b418cd213c23774.jpg-w270h180', null, '2021-04-14 18:04:04');
INSERT INTO science_resource.service_table (service_id, service_name, service_price, service_charge, service_means_of_payment, service_field, service_desc, service_procedure, service_period, service_acceptance, service_way, service_location, service_circumstance, service_deliverable_name, service_deliverable_type, service_deliver_date, service_deliverable_copyright, service_provider, service_category, service_picture, server_id, create_time) VALUES (23, '助力贷', '最高500万，其中信用额度最高200万元', null, null, null, '一、适用行业

（1）新一代信息技术；（2）软件开发；（3）高端制造业；（4）节能环保；（5）生物医药； （6）新材料、新能源；（7）新型农业

二、评审特点

以纳税的现金收入审核为主，最高可给予200万元的信用额度，企业如能提供房产抵押，还可以增加额度，总体额度最高不超过500万元

三、授信额度

最高500万，其中信用额度最高200万元

四、评审要点

（1）行业选择、纳税规范

（2）增值税平均税负：年度已缴纳的增值税金额/年度纳税收入

（3）纳税收入核实：纳税申报表、纳税凭证、银行对账单

（4）已有贷款：扣减企业现有贷款/授信余额，实际控制人夫妻现有经营性贷款/授信余额', null, '未知', null, null, null, null, null, null, null, null, '北京银行清华园支行', '科技金融服务', 'http://kaka2008.chinagazelle.cn/575d2798824ac30070762f3f049bf18a.jpg-w270h180', null, '2021-04-14 18:04:04');
INSERT INTO science_resource.service_table (service_id, service_name, service_price, service_charge, service_means_of_payment, service_field, service_desc, service_procedure, service_period, service_acceptance, service_way, service_location, service_circumstance, service_deliverable_name, service_deliverable_type, service_deliver_date, service_deliverable_copyright, service_provider, service_category, service_picture, server_id, create_time) VALUES (24, '创业贷', '授信额20万-50万', null, null, '
（1）新一代信息技术；（2）软件开发；（3）高端制造业；（4）节能环保；（5）生物医药； （6）新材料、新能源；（7）新型农业', '一、适用行业

（1）科技类、文化创意类企业

（2）企业年度纳税收入20万元以上（含）

二、授信额度

基础额度20万元，最高额度不超过50万元

三、基本额度部分评审标准

（1）工商手续完备；（2）特许经营相关资质在有效期内；（3）企业、实际控制人未发现互保联保；（4）企业、实际控制人未涉未决诉讼；（5）企业不存在不良信用记录，实际控制人个人征信上近2年不超过6笔逾期记录，且每笔逾期时间不超过1个月；（6）企业所在孵化器出具推荐函或已申请到科委创新券

四、增加额度部分评审要点

（1）经营年限；（2）企业实际控制人（创业团队核心人员或高管团队）学历情况；（3）企业资质；（4）企业拥有的专利情况；（5）除实际控制人外，企业创业团队核心人员（或高管人员）提供个人无限连带责任人数及其名下资产情况；（6）企业纳税收入；（7）股东情况；（8）申请创新券及使用情况。', null, '未知', null, null, null, null, null, null, null, null, '北京银行清华园支行', '科技金融服务', 'http://kaka2008.chinagazelle.cn/943d09c47aa9eb97db16cbc392d9f998.jpg-w270h180', null, '2021-04-14 18:04:04');
INSERT INTO science_resource.service_table (service_id, service_name, service_price, service_charge, service_means_of_payment, service_field, service_desc, service_procedure, service_period, service_acceptance, service_way, service_location, service_circumstance, service_deliverable_name, service_deliverable_type, service_deliver_date, service_deliverable_copyright, service_provider, service_category, service_picture, server_id, create_time) VALUES (25, '代开增值税专用发票', '500元/次（以公司为单位）', '一价全含', '一次性付款', '各行业', '        小规模纳税人与一般纳税人企业发生业务往来，对方要求提供增值税专用发票的情况下，企业需到主管税务机关进行发票代开。

         更多详情请查看北京天拓力行顾问咨询有限公司官方网站：www.tiantuolixing.com', '1、签订《委托服务协议》及相关保密条款
2、客户资料审核
3、网上登记
4、现场提交材料
5、扣缴税款
6、领取税务局代开发票', '1个工作日', '在约定时间内取得增值税专用发票', '委托', '北京', '1、已与合作方签订服务合同。

2、有CA证书。

3、企业为增值税小规模纳税人或个体工商户，且未被锁入警示系统。', null, null, null, null, '北京天拓力行顾问咨询有限公司', '科技金融服务', 'http://kaka2008.chinagazelle.cn/41b4ca3d7a97b558deee8f661e6a7e99.jpg-w270h180', null, '2021-04-14 18:04:04');
INSERT INTO science_resource.service_table (service_id, service_name, service_price, service_charge, service_means_of_payment, service_field, service_desc, service_procedure, service_period, service_acceptance, service_way, service_location, service_circumstance, service_deliverable_name, service_deliverable_type, service_deliver_date, service_deliverable_copyright, service_provider, service_category, service_picture, server_id, create_time) VALUES (26, '税控及发票申请审批', '1500起', '一价全含', '一次性付款', '各行业', '发票是指在购销商品、提供或者接受服务以及从事其他经营活动中，开具、收取的收付款凭证。企业单位对外发生经营业务收取款项前，应根据《中华人民共和国发票管理办法》及其实施细则，当向税务部门申请税控及发票。

        更多详情请查看北京天拓力行顾问咨询有限公司官方网站：www.tiantuolixing.com', '1、签订《委托服务协议》和相关保密条款
2、起草和提交申请资料
3、税务局审批
4、申购小规模税控设备及发票
5、税控设备安装及开票培训', '10-15个工作日', '获得小规模企业开票资格 一套增值税普通税控设备及发票 全套申请资料（纸质/电子版）', '委托', '北京', '1、依法设立的企业法人机构。
2、根据《中华人民共和国发票管理办法》需开具发票的。
3、已签订国税、企业、银行三方协议。', null, null, null, null, '北京天拓力行顾问咨询有限公司', '科技金融服务', 'http://kaka2008.chinagazelle.cn/9cbeac7ab43bcd64c61ccbdaa5c6e504.jpg-w270h180', null, '2021-04-14 18:04:04');
INSERT INTO science_resource.service_table (service_id, service_name, service_price, service_charge, service_means_of_payment, service_field, service_desc, service_procedure, service_period, service_acceptance, service_way, service_location, service_circumstance, service_deliverable_name, service_deliverable_type, service_deliver_date, service_deliverable_copyright, service_provider, service_category, service_picture, server_id, create_time) VALUES (27, '服务1', '价格1', null, null, null, '具体细节1', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO science_resource.service_table (service_id, service_name, service_price, service_charge, service_means_of_payment, service_field, service_desc, service_procedure, service_period, service_acceptance, service_way, service_location, service_circumstance, service_deliverable_name, service_deliverable_type, service_deliver_date, service_deliverable_copyright, service_provider, service_category, service_picture, server_id, create_time) VALUES (28, '服务1', '价格1', null, null, null, '111', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO science_resource.service_table (service_id, service_name, service_price, service_charge, service_means_of_payment, service_field, service_desc, service_procedure, service_period, service_acceptance, service_way, service_location, service_circumstance, service_deliverable_name, service_deliverable_type, service_deliver_date, service_deliverable_copyright, service_provider, service_category, service_picture, server_id, create_time) VALUES (29, '服务1', '价格1', null, null, null, '111', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO science_resource.service_table (service_id, service_name, service_price, service_charge, service_means_of_payment, service_field, service_desc, service_procedure, service_period, service_acceptance, service_way, service_location, service_circumstance, service_deliverable_name, service_deliverable_type, service_deliver_date, service_deliverable_copyright, service_provider, service_category, service_picture, server_id, create_time) VALUES (30, '服务1', '价格1', null, null, null, '111', null, null, null, null, null, null, null, null, null, null, null, null, null, null, '2021-04-25 15:38:24');
INSERT INTO science_resource.service_table (service_id, service_name, service_price, service_charge, service_means_of_payment, service_field, service_desc, service_procedure, service_period, service_acceptance, service_way, service_location, service_circumstance, service_deliverable_name, service_deliverable_type, service_deliver_date, service_deliverable_copyright, service_provider, service_category, service_picture, server_id, create_time) VALUES (31, '服务1', '价格1', null, null, null, '111', null, null, null, null, null, null, null, null, null, null, null, '科学研究与试验发展服务/自然科学、工程、农业和医学研究', null, null, '2021-04-25 15:41:57');
INSERT INTO science_resource.service_table (service_id, service_name, service_price, service_charge, service_means_of_payment, service_field, service_desc, service_procedure, service_period, service_acceptance, service_way, service_location, service_circumstance, service_deliverable_name, service_deliverable_type, service_deliver_date, service_deliverable_copyright, service_provider, service_category, service_picture, server_id, create_time) VALUES (32, '服务1', '价格1', null, '一次性支付', null, '111', null, null, null, null, null, null, null, null, null, null, null, '专业化技术服务/专业化技术公共服务', null, null, '2021-04-25 15:45:52');
INSERT INTO science_resource.service_table (service_id, service_name, service_price, service_charge, service_means_of_payment, service_field, service_desc, service_procedure, service_period, service_acceptance, service_way, service_location, service_circumstance, service_deliverable_name, service_deliverable_type, service_deliver_date, service_deliverable_copyright, service_provider, service_category, service_picture, server_id, create_time) VALUES (33, '服务1', '价格1', null, '一次性支付', null, '111', null, '12', null, null, null, null, null, null, null, null, null, '科学研究与试验发展服务/自然科学、工程、农业和医学研究', null, null, '2021-04-25 15:48:12');
