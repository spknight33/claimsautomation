@Ignore
Feature: Validation at step3 of FNOL

  Background: 
    Given As a ClaimsHandler I am at step2 for FNOL
    
    @Ignore
  Scenario: CBPCL-200  TC11   IncidentType/Cause/Subcause requiring PEDESTRIAN incident will PASS validation if PEDESTRIAN is present
    And I complete step2 for FNOL
    And I select the insureds vehicle at step3
    And I will be on vehicle screen for FNOL
    And I select "AddDriver" on vehicle screen
    And I select "Paul Milligan" from "Driver Name" on driver screen
    And I click ok button on driver screen
    And I click ok button on vehicle screen
    And I select "AddPedestrian" on vehicle screen
    When I select the loss causes I will be able to proceed past step3 with no validation error
      | incident type | cause   | sub cause |
    | Accident      | Accident Involving Pedestrian | Struck pedestrian crossing from nearside from between parked vehicles |
      | Accident      | Accident Involving Pedestrian | Struck pedestrian on pedestrian crossing                              |
      | Accident      | Accident Involving Pedestrian | Struck pedestrian crossing road                                       |
      | Accident      | Accident Involving Pedestrian | Struck pedestrian/child whilst reversing                              |
      | Accident      | Accident Involving Pedestrian | Struck pedestrian on pelican crossing - lights in our favour          |
      | Accident      | Accident Involving Pedestrian | Struck pedestrian on pelican crossing - lights not in our favour      |
      | Accident      | Collision Whilst Reversing    | Struck pedestrian/child                                               |

  @Ignore
  Scenario: CBPCL-200  TC11   IncidentType/Cause/Subcause requiring no INSURED VEHICLE incident will PASS validation if no INSURED VEHICLE is present
    And I complete step2 for FNOL without insured vehicle
    When I select the loss causes I will be able to proceed past step3 with no validation error
      | incident type | cause   | sub cause |
      | Windscreen    | Repair  | Repair    |
      | Windscreen    | Replace | Replace   |

  @Ignore
  Scenario: CBPCL-200  TC12   IncidentType/Cause/Subcause requiring JUST INSURED VEHICLE incident will PASS validation if INSURED VEHICLE is present
    And I complete step2 for FNOL
    When I select the loss causes I will be able to proceed past step3 with no validation error
      | incident type      | cause                                 | sub cause                                                              |
      | Accident           | Insured Vehicle Damaged Whilst Parked | In private car park                                                    |
      | Accident           | Insured Vehicle Damaged Whilst Parked | In public car park                                                     |
      | Accident           | Insured Vehicle Damaged Whilst Parked | On road not outside own home                                           |
      | Accident           | Insured Vehicle Damaged Whilst Parked | On road outside own home                                               |
      | Accident           | Insured Vehicle Damaged Whilst Parked | In works car park                                                      |
      | Theft              | Attempted Theft                       | Boot damaged / forced open                                             |
      | Theft              | Attempted Theft                       | Door forced/lock drilled out/lock forced                               |
      | Theft              | Attempted Theft                       | Rear window broken in an attempt to gain entry                         |
      | Theft              | Attempted Theft                       | Side window broken in an attempt to gain entry                         |
      | Theft              | Attempted Theft                       | Steering lock damaged/forced                                           |
      | Misfuelling        | Misfuelling                           | Misfuelling - Diesel into Petrol                                       |
      | Misfuelling        | Misfuelling                           | Misfuelling - Petrol into Diesel                                       |
      | Flood/Water Damage | Flood / Water Damage                  | Vehicle immersed in fresh water                                        |
      | Flood/Water Damage | Flood / Water Damage                  | Vehicle immersed in sea water                                          |
      | Malicious Damage   | Malicious Damage                      | Corrosive Liquid thrown at / deposited on the car                      |
      | Malicious Damage   | Malicious Damage                      | Bodywork damaged                                                       |
      | Malicious Damage   | Malicious Damage                      | Mechanical components damaged                                          |
      | Malicious Damage   | Malicious Damage                      | Fuel tank damaged - contaminated                                       |
      | Malicious Damage   | Malicious Damage                      | Interior damaged                                                       |
      | Malicious Damage   | Malicious Damage                      | Roof slashed - damaged (convertible/cabrio)                            |
      | Malicious Damage   | Malicious Damage                      | Tyres slashed - damaged                                                |
      | Malicious Damage   | Riot or Civil Commotion               | Riot / civil commotion - Less than 12 people                           |
      | Malicious Damage   | Riot or Civil Commotion               | Riot / civil commotion - More than 12 people                           |
      | Snow               | Snow damage                           | Damage Caused by a Snow Slide                                          |
      | Snow               | Snow damage                           | Snow Damage                                                            |
      | Storm              | Storm Damage                          | Damaged by falling tree / Debris e.g. roof tiles - own property        |
      | Storm              | Storm Damage                          | Damaged by falling tree / Debris e.g. roof tiles - not own property    |
      | Storm              | Storm Damage                          | Hail storm damage                                                      |
      | Storm              | Storm Damage                          | Damaged by Lightning                                                   |
      | Storm              | Storm Damage                          | Storm Damage                                                           |
      | Theft              | Theft From Vehicle                    | Audio from locked vehicle                                              |
      | Theft              | Theft From Vehicle                    | Audio from unlocked vehicle                                            |
      | Theft              | Theft From Vehicle                    | Stolen by force / threat of violence / deception                       |
      | Theft              | Theft From Vehicle                    | Personal items from locked vehicle                                     |
      | Theft              | Theft From Vehicle                    | Personal items from unlocked vehicle                                   |
      | Theft              | Theft From Vehicle                    | Bodywork parts stolen from locked vehicle                              |
      | Theft              | Theft From Vehicle                    | Satellite Navigation stolen from locked vehicle                        |
      | Theft              | Theft From Vehicle                    | Satellite Navigation stolen from unlocked vehicle                      |
      | Theft              | Theft From Vehicle                    | Theft Of wheels                                                        |
      | Theft              | Theft Unrecovered                     | Stolen by force / threat of violence / deception                       |
      | Theft              | Theft Unrecovered                     | Stolen whilst parked on the road - outside own home                    |
      | Theft              | Theft Unrecovered                     | Stolen whilst parked on the road - not outside own home                |
      | Theft              | Theft Unrecovered                     | From driveway - no locked gates                                        |
      | Theft              | Theft Unrecovered                     | From driveway - secured by locked gates                                |
      | Theft              | Theft Unrecovered                     | From locked garage                                                     |
      | Theft              | Theft Unrecovered                     | From unlocked garage                                                   |
      | Theft              | Theft Recovered                       | Stolen by force / threat of violence / deception                       |
      | Theft              | Theft Recovered                       | Stolen whilst parked on the road - outside own home                    |
      | Theft              | Theft Recovered                       | Stolen whilst parked on the road - not outside own home                |
      | Theft              | Theft Recovered                       | From driveway - no locked gates                                        |
      | Theft              | Theft Recovered                       | From driveway - secured by locked gates                                |
      | Theft              | Theft Recovered                       | From locked garage                                                     |
      | Theft              | Theft Recovered                       | From unlocked garage                                                   |
      | Theft              | Attempted Theft                       | Boot damaged / forced open                                             |
      | Theft              | Attempted Theft                       | Door forced/lock drilled out/lock forced                               |
      | Theft              | Attempted Theft                       | Rear window broken in an attempt to gain entry                         |
      | Theft              | Attempted Theft                       | Side window broken in an attempt to gain entry                         |
      | Theft              | Attempted Theft                       | Steering lock damaged/forced                                           |
      | Fire               | Vehicle Damaged By Fire               | Arson attack                                                           |
      | Fire               | Vehicle Damaged By Fire               | Dropped cigarette/match/lighter                                        |
      | Fire               | Vehicle Damaged By Fire               | Garage fire                                                            |
      | Fire               | Vehicle Damaged By Fire               | Manufacturer defect                                                    |
      | Fire               | Vehicle Damaged By Fire               | Whilst undergoing DIY mechanical repair                                |
      | Fire               | Vehicle Damaged By Fire               | Whilst undergoing mechanical repair by third party                     |
      | Fire               | Vehicle Damaged By Fire               | Petrol leakage (whilst idling)                                         |
      | Fire               | Vehicle Damaged By Fire               | Petrol leakage (whilst travelling)                                     |
      | Fire               | Vehicle Damaged By Fire               | Whilst undergoing DIY structural repair, including welding             |
      | Fire               | Vehicle Damaged By Fire               | Whilst undergoing structural repair, including welding, by third party |
      | Fire               | Vehicle Damaged By Fire               | Wiring fault                                                           |

  Scenario: CBPCL-200  TC12   IncidentType/Cause/Subcause requiring just INSURED VEHICLE AND INSURED DRIVER incident will PASS validation if INSURED VEHICLE/DRIVER is present
    And I complete step2 for FNOL
    And I select the insureds vehicle at step3
    And I will be on vehicle screen for FNOL
    And I select "AddDriver" on vehicle screen
    And I select "Paul Milligan" from "Driver Name" on driver screen
    And I click ok button on driver screen
    And I click ok button on vehicle screen
    When I select the loss causes I will be able to proceed past step3 with no validation error
      | incident type      | cause                              | sub cause                                                                             |
      | Accident           | Accident Involving Animal          | Collided with animal - owner known                                                    |
      | Accident           | Accident Involving Animal          | Collided with animal - owner unknown                                                  |
      | Accident           | Accident Involving Animal          | Damage caused by vermin / birds                                                       |
      | Accident           | Accident Involving Animal          | Swerved to avoid an animal which ran into the road, collided with parked vehicle      |
      | Accident           | Accident Involving Animal          | Swerved to avoid an animal which ran into the road, collided with an oncoming vehicle |
      | Accident           | Accident Involving Animal          | Swerved to avoid an animal - vehicle left road                                        |
      | Accident           | Loss of Consciousness / Automatism | Caused by known condition - own damage only                                           |
      | Accident           | Loss of Consciousness / Automatism | Caused by unknown condition - own damage only                                         |
      | Accident           | Loss of Consciousness / Automatism | Caused by known condition - involving TP vehicle / property                           |
      | Accident           | Loss of Consciousness / Automatism | Caused by unknown condition - involving TP vehicle / property                         |
      | Accident           | Loss Of Control                    | Insured failed to negotiate left hand bend                                            |
      | Accident           | Loss Of Control                    | Insured lost control due to adverse weather conditions                                |
      | Accident           | Loss Of Control                    | Lost Control Human Error                                                              |
      | Accident           | Loss Of Control                    | Lost control due to mechanical failure                                                |
      | Accident           | Loss Of Control                    | Having had attention distracted                                                       |
      | Accident           | Loss Of Control                    | Insured failed to negotiate right hand bend                                           |
      | Accident           | Loss Of Control                    | Turning corner into/out of side road - mounted pavement                               |
      | Flood/Water Damage | Flood / Water Damage               | Attempted to drive through Flooded area - fresh water                                 |
      | Flood/Water Damage | Flood / Water Damage               | Attempted to drive through Flooded area - sea water                                   |
      | Accident           | Caused By Debris On The Road       | Debris from unknown third party                                                       |
      | Accident           | Insured's Vehicle Left Road        | Obstruction / Debris in the road                                                      |
      | Accident           | Insured's Vehicle Left Road        | Poor road / weather conditions                                                        |
      | Accident           | Narrow Road Collision              | Brow of a hill / bridge                                                               |
      | Accident           | Narrow Road Collision              | Narrow road / country Lane                                                            |
      | Accident           | Narrow Road Collision              | Insured passing parked cars                                                           |
      | Accident           | Narrow Road Collision              | Road narrowed by parked cars either side                                              |
      | Accident           | Narrow Road Collision              | Insured rounding bend                                                                 |
      | Accident           | Reported by TP                     | Reported by TP                                                                        |
      | Accident           | Collision Whilst Reversing         | Lost control due to black ice - adverse weather conditions                            |
      | Accident           | Collision Whilst Reversing         | Lost control due to mechanical failure                                                |
      | Snow               | Snow damage                        | Policyholder Loss of Control                                                          |
      | Accident           | Collision In Car Park              | Having swerved to avoid a pedestrian                                                  |
      | Accident           | Collision In Car Park              | Having had attention distracted                                                       |
      | Accident           | Collision In Car Park              | Lost control due to mechanical failure                                                |
      | Accident           | Collision In Car Park              | Having swerved to avoid another vehicle which did not stop                            |
      | Accident           | Collision In Car Park              | Lost control due to black ice - adverse weather conditions                            |
      | Accident           | Collision In Car Park              | Basic error of judgement                                                              |
     