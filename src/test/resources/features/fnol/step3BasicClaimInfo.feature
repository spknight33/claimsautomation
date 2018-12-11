Feature: CBPCL-176 As an Operator, I want to be able to record "Fault" "Split Liability" and "Non Fault" fault causes.
  I want this to be displayed so I am aware which fault code applies. This also needs to be able to be changed.

  Background: 
    Given As a ClaimsHandler I am at step3 for FNOL

  @Ignore
  Scenario: CBPCL-176 TC1 Valid options are shown in the 'Incident Type' question
    Then the "Incident Type" list on step3 will contain options
      | Accident | Fire | Flood/Water Damage | Malicious Damage | Misfuelling | Snow | Storm | Theft | Windscreen |

  Scenario: CBPCL-176 TC1 Accident Incident type, cause and subcauses will generate correct fault code
    Then I will see fault based on loss causes
      | incident type | cause                                                | sub cause                                                                                                        | fault type      |
      | Accident      | Accident Involving Animal                            | Collided with animal - owner known                                                                               | Fault           |
      | Accident      | Accident Involving Animal                            | Collided with animal - owner unknown                                                                             | Fault           |
      | Accident      | Accident Involving Animal                            | Damage caused by vermin / birds                                                                                  | Fault           |
      | Accident      | Accident Involving Animal                            | Swerved to avoid an animal which ran into the road, collided with parked vehicle                                 | Fault           |
      | Accident      | Accident Involving Animal                            | Swerved to avoid an animal which ran into the road, collided with an oncoming vehicle                            | Fault           |
      | Accident      | Accident Involving Animal                            | Swerved to avoid an animal - vehicle left road                                                                   | Fault           |
      | Accident      | Accident Involving Cyclist                           | Struck cyclist crossing                                                                                          | Fault           |
      | Accident      | Accident Involving Cyclist                           | Lost control due to mechanical failure                                                                           | Fault           |
      | Accident      | Accident Involving Cyclist                           | Struck cyclist turning left                                                                                      | Fault           |
      | Accident      | Accident Involving Cyclist                           | Struck cyclist turning right                                                                                     | Fault           |
      | Accident      | Accident Involving Cyclist                           | Struck cyclist whilst passing                                                                                    | Fault           |
      | Accident      | Accident Involving Pedestrian                        | Struck pedestrian crossing from nearside from between parked vehicles                                            | Fault           |
      | Accident      | Accident Involving Pedestrian                        | Struck pedestrian on pedestrian crossing                                                                         | Fault           |
      | Accident      | Accident Involving Pedestrian                        | Struck pedestrian crossing road                                                                                  | Fault           |
      | Accident      | Accident Involving Pedestrian                        | Struck pedestrian/child whilst reversing                                                                         | Fault           |
      | Accident      | Accident Involving Pedestrian                        | Struck pedestrian on pelican crossing - lights in our favour                                                     | Split Liability |
      | Accident      | Accident Involving Pedestrian                        | Struck pedestrian on pelican crossing - lights not in our favour                                                 | Fault           |
      | Accident      | Car Door Open                                        | Third party opened car door into path of insured                                                                 | Non Fault       |
      | Accident      | Car Door Open                                        | Insured opened car door into path of passing third party                                                         | Fault           |
      | Accident      | Car Door Open                                        | Insured door already open when hit by third party                                                                | Non Fault       |
      | Accident      | Caused By Debris On The Road                         | Third party vehicle damaged by debris from insured vehicle                                                       | Fault           |
      | Accident      | Caused By Debris On The Road                         | Debris from known third party                                                                                    | Non Fault       |
      | Accident      | Caused By Debris On The Road                         | Debris from unknown third party                                                                                  | Fault           |
      | Accident      | Changing Lanes                                       | Insured failed to notice third party vehicle                                                                     | Fault           |
      | Accident      | Changing Lanes                                       | Swerved to avoid a vehicle which did not stop and collided with a third party                                    | Fault           |
      | Accident      | Changing Lanes                                       | Swerved to avoid a vehicle which braked suddenly and collided with third party                                   | Fault           |
      | Accident      | Changing Lanes                                       | Third party failed to notice Insured                                                                             | Non Fault       |
      | Accident      | Changing Lanes                                       | Third party swerved into my path                                                                                 | Non Fault       |
      | Accident      | Collided With Fixed Object                           | Having swerved to avoid an animal which ran across the road                                                      | Fault           |
      | Accident      | Collided With Fixed Object                           | Having swerved to avoid a pedestrian crossing the road                                                           | Fault           |
      | Accident      | Collided With Fixed Object                           | Having had attention distracted                                                                                  | Fault           |
      | Accident      | Collided With Fixed Object                           | Basic error of judgement                                                                                         | Fault           |
      | Accident      | Collided With Fixed Object                           | Having lost concentration due to fatigue                                                                         | Fault           |
      | Accident      | Collided With Fixed Object                           | Lost control due to mechanical failure                                                                           | Fault           |
      | Accident      | Collided With Fixed Object                           | Lost control due to black ice - adverse weather conditions                                                       | Fault           |
      | Accident      | Collided With Parked Third Party Vehicle at Roadside | Having had attention distracted                                                                                  | Fault           |
      | Accident      | Collided With Parked Third Party Vehicle at Roadside | Having lost concentration due to fatigue                                                                         | Fault           |
      | Accident      | Collided With Parked Third Party Vehicle at Roadside | Basic error of judgement                                                                                         | Fault           |
      | Accident      | Collided With Parked Third Party Vehicle at Roadside | Lost control due to mechanical failure                                                                           | Fault           |
      | Accident      | Collided With Parked Third Party Vehicle at Roadside | Lost control due to black ice - adverse weather conditions                                                       | Fault           |
      | Accident      | Collided With Parked Third Party Vehicle at Roadside | Having swerved to avoid an animal which ran across the road                                                      | Fault           |
      | Accident      | Collided With Parked Third Party Vehicle at Roadside | Having swerved to avoid a pedestrian crossing the road                                                           | Fault           |
      | Accident      | Collision At Roundabout                              | Entering roundabout collided with third party vehicle from right                                                 | Fault           |
      | Accident      | Collision At Roundabout                              | Hit in rear by third party vehicle whilst waiting to enter roundabout                                            | Non Fault       |
      | Accident      | Collision At Roundabout                              | Hit in rear by third party vehicle whilst negotiating roundabout                                                 | Non Fault       |
      | Accident      | Collision At Roundabout                              | Collided with nearside of third party vehicle whilst negotiating a roundabout                                    | Split Liability |
      | Accident      | Collision At Roundabout                              | Collided with offside of third party vehicle when attempting to leave roundabout                                 | Split Liability |
      | Accident      | Collision At Roundabout                              | Hit rear of third party vehicle whilst negotiating roundabout                                                    | Fault           |
      | Accident      | Collision At Roundabout                              | Hit rear of third party vehicle who was waiting to enter roundabout                                              | Fault           |
      | Accident      | Collision At Roundabout                              | Negotiating roundabout - when third party vehicle entered from left                                              | Non Fault       |
      | Accident      | Collision At Roundabout                              | Third party vehicle changed lanes without warning                                                                | Non Fault       |
      | Accident      | Collision At 'T' Junction                            | Insured emerged from minor road into path of third party TP gave misleading signal                               | Split Liability |
      | Accident      | Collision At 'T' Junction                            | Insured emerged from minor road into path of third party                                                         | Fault           |
      | Accident      | Collision At 'T' Junction                            | Third party vehicle emerged from minor road into path of insured who was overtaking a line of stationary traffic | Split Liability |
      | Accident      | Collision At 'T' Junction                            | Insured turned left as third party vehicle attempted to pass on nearside                                         | Non Fault       |
      | Accident      | Collision At 'T' Junction                            | Insured turned right across path of oncoming third party vehicle                                                 | Fault           |
      | Accident      | Collision At 'T' Junction                            | Insured turned right as third party vehicle attempted to pass on offside                                         | Split Liability |
      | Accident      | Collision At 'T' Junction                            | Third party vehicle emerged from minor road into path of insured                                                 | Non Fault       |
      | Accident      | Collision At 'T' Junction                            | Insured turning right out of minor road - into path of TP overtaking a line of stationary traffic                | Split Liability |
      | Accident      | Collision At 'T' Junction                            | Third party turned right as insured attempted to pass on offside                                                 | Split Liability |
      | Accident      | Collision At 'T' Junction                            | Third party turned left as insured attempted to pass on nearside                                                 | Split Liability |
      | Accident      | Collision At 'T' Junction                            | Oncoming third party vehicle turned right across path of insured                                                 | Non Fault       |
      | Accident      | Collision At 'X' Roads                               | Governed by 'give way' signs - Insured on major road                                                             | Non Fault       |
      | Accident      | Collision At 'X' Roads                               | Governed by 'give way' signs - Insured on minor road                                                             | Fault           |
      | Accident      | Collision At 'X' Roads                               | Insured turned right across path of oncoming third party vehicle - no filter light                               | Fault           |
      | Accident      | Collision At 'X' Roads                               | Insured turning left hit by third party                                                                          | Fault           |
      | Accident      | Collision At 'X' Roads                               | Insured turning right across path of third party                                                                 | Fault           |
      | Accident      | Collision At 'X' Roads                               | Neither party had right of way                                                                                   | Split Liability |
      | Accident      | Collision At 'X' Roads                               | Governed by 'stop' signs - Insured on major road                                                                 | Non Fault       |
      | Accident      | Collision At 'X' Roads                               | Governed by 'stop' signs - Insured on minor road                                                                 | Fault           |
      | Accident      | Collision At 'X' Roads                               | Oncoming third party vehicle turned right across path of insured - no filter light                               | Non Fault       |
      | Accident      | Collision At 'X' Roads                               | Third party turning left (no signal) hit by Insured                                                              | Non Fault       |
      | Accident      | Collision At 'X' Roads                               | Third party turning left (having signalled correctly) hit by Insured                                             | Non Fault       |
      | Accident      | Collision At 'X' Roads                               | Third party turning right (no signal) across path of Insured                                                     | Non Fault       |
      | Accident      | Collision At 'X' Roads                               | Third party turning right (having signalled correctly) across path of insured                                    | Non Fault       |
      | Accident      | Collision At 'X' Roads                               | Governed by traffic lights - Insured crossed on amber                                                            | Non Fault       |
      | Accident      | Collision At 'X' Roads                               | Governed by traffic lights - Insured crossed on green                                                            | Non Fault       |
      | Accident      | Collision At 'X' Roads                               | Governed by traffic lights - Insured crossed on red                                                              | Non Fault       |
      | Accident      | Collision Between Oncoming Vehicles                  |                                                                                                                  |                 |
      | Accident      | Collision Between Oncoming Vehicles                  |                                                                                                                  |                 |
      | Accident      | Collision Between Oncoming Vehicles                  |                                                                                                                  |                 |
      | Accident      | Collision Between Oncoming Vehicles                  |                                                                                                                  |                 |
      | Accident      | Collision In Car Park                                |                                                                                                                  |                 |
      | Accident      | Collision In Car Park                                |                                                                                                                  |                 |
      | Accident      | Collision In Car Park                                |                                                                                                                  |                 |
      | Accident      | Collision In Car Park                                |                                                                                                                  |                 |
      | Accident      | Collision Whilst Reversing                           |                                                                                                                  |                 |
      | Accident      | Collision Whilst Reversing                           |                                                                                                                  |                 |
      | Accident      | Collision Whilst Reversing                           |                                                                                                                  |                 |
      | Accident      | Collision Whilst Reversing                           |                                                                                                                  |                 |
      | Accident      | Collision Whilst Reversing                           |                                                                                                                  |                 |
      | Accident      | Hit in Rear By Third Party                           |                                                                                                                  |                 |
      | Accident      | Hit in Rear By Third Party                           |                                                                                                                  |                 |
      | Accident      | Hit in Rear By Third Party                           |                                                                                                                  |                 |
      | Accident      | Hit in Rear By Third Party                           |                                                                                                                  |                 |
      | Accident      | Hit in Rear By Third Party                           |                                                                                                                  |                 |
      | Accident      | Hit Rear Of Third Party                              |                                                                                                                  |                 |
      | Accident      | Hit Rear Of Third Party                              |                                                                                                                  |                 |
      | Accident      | Hit Rear Of Third Party                              |                                                                                                                  |                 |
      | Accident      | Hit Rear Of Third Party                              |                                                                                                                  |                 |
      | Accident      | Hit Rear Of Third Party                              |                                                                                                                  |                 |
      | Accident      | Insured Vehicle Damaged Whilst Parked                |                                                                                                                  |                 |
      | Accident      | Insured Vehicle Damaged Whilst Parked                |                                                                                                                  |                 |
      | Accident      | Insured Vehicle Damaged Whilst Parked                |                                                                                                                  |                 |
      | Accident      | Insured Vehicle Damaged Whilst Parked                |                                                                                                                  |                 |
      | Accident      | Insured Vehicle Damaged Whilst Parked                |                                                                                                                  |                 |
      | Accident      | Insured's Vehicle Left Road                          |                                                                                                                  |                 |
      | Accident      | Joining/Leaving Slip Roads/Motorways                 |                                                                                                                  |                 |
      | Accident      | Loss of Consciousness / Automatism                   |                                                                                                                  |                 |
      | Accident      | Loss Of Control                                      |                                                                                                                  |                 |
      | Accident      | Moving From Stationary Position                      |                                                                                                                  |                 |
      | Accident      | Multiple Vehicle - Shunt                             |                                                                                                                  |                 |
      | Accident      | Narrow Road Collision                                |                                                                                                                  |                 |
      | Accident      | Overtaking                                           |                                                                                                                  |                 |
      | Accident      | Reported by TP                                       |                                                                                                                  |                 |
      | Accident      | Unknown                                              |                                                                                                                  |                 |

  @Ignore
  Scenario: CBPCL-176 TC3 Fire Incident type, cause and subcauses will generate correct fault code
    Then I will see fault based on loss causes
      | incident type | cause                   | sub cause                                                              | fault type |
      | Fire          | Vehicle Damaged By Fire | Arson attack                                                           | Fault      |
      | Fire          | Vehicle Damaged By Fire | Dropped cigarette/match/lighter                                        | Fault      |
      | Fire          | Vehicle Damaged By Fire | Garage fire                                                            | Fault      |
      | Fire          | Vehicle Damaged By Fire | Manufacturer defect                                                    | Non Fault  |
      | Fire          | Vehicle Damaged By Fire | Whilst undergoing DIY mechanical repair                                | Fault      |
      | Fire          | Vehicle Damaged By Fire | Whilst undergoing mechanical repair by third party                     | Fault      |
      | Fire          | Vehicle Damaged By Fire | Petrol leakage (whilst idling)                                         | Fault      |
      | Fire          | Vehicle Damaged By Fire | Petrol leakage (whilst travelling)                                     | Fault      |
      | Fire          | Vehicle Damaged By Fire | Parked next to or close by a property on fire                          | Non Fault  |
      | Fire          | Vehicle Damaged By Fire | Parked next to or close by a vehicle on fire                           | Non Fault  |
      | Fire          | Vehicle Damaged By Fire | Whilst undergoing DIY structural repair, including welding             | Fault      |
      | Fire          | Vehicle Damaged By Fire | Whilst undergoing structural repair, including welding, by third party | Non Fault  |
      | Fire          | Vehicle Damaged By Fire | Wiring fault                                                           | Non Fault  |

  @Ignore
  Scenario: CBPCL-176 TC4 Flood/Water Damage Incident type, cause and subcauses will generate correct fault code
    Then I will see fault based on loss causes
      | incident type      | cause                | sub cause                                             | fault type |
      | Flood/Water Damage | Flood / Water Damage | Attempted to drive through Flooded area - fresh water | Fault      |
      | Flood/Water Damage | Flood / Water Damage | Attempted to drive through Flooded area - sea water   | Fault      |
      | Flood/Water Damage | Flood / Water Damage | Vehicle immersed in fresh water                       | Fault      |
      | Flood/Water Damage | Flood / Water Damage | Vehicle immersed in sea water                         | Fault      |

  @Ignore
  Scenario: CBPCL-176 TC5 Malicious Damage Incident type, cause and subcauses will generate correct fault code
    Then I will see fault based on loss causes
      | incident type    | cause                   | sub cause                                         | fault type |
      | Malicious Damage | Malicious Damage        | Corrosive Liquid thrown at / deposited on the car | Fault      |
      | Malicious Damage | Malicious Damage        | Bodywork damaged                                  | Fault      |
      | Malicious Damage | Malicious Damage        | Mechanical components damaged                     | Fault      |
      | Malicious Damage | Malicious Damage        | Fuel tank damaged - contaminated                  | Fault      |
      | Malicious Damage | Malicious Damage        | Interior damaged                                  | Fault      |
      | Malicious Damage | Malicious Damage        | Roof slashed - damaged (convertible/cabrio)       | Fault      |
      | Malicious Damage | Malicious Damage        | Tyres slashed - damaged                           | Fault      |
      | Malicious Damage | Riot or Civil Commotion | Riot / civil commotion - Less than 12 people      | Fault      |
      | Malicious Damage | Riot or Civil Commotion | Riot / civil commotion - More than 12 people      | Fault      |

  @Ignore
  Scenario: CBPCL-176 TC6 Misfuelling Incident type, cause and subcauses will generate correct fault code
    Then I will see fault based on loss causes
      | incident type | cause       | sub cause                        | fault type |
      | Misfuelling   | Misfuelling | Misfuelling - Diesel into Petrol | Fault      |
      | Misfuelling   | Misfuelling | Misfuelling - Petrol into Diesel | Fault      |

  @Ignore
  Scenario: CBPCL-176 TC7 Snow Incident type, cause and subcauses will generate correct fault code
    Then I will see fault based on loss causes
      | incident type | cause       | sub cause                     | fault type |
      | Snow          | Snow damage | Damage Caused by a Snow Slide | Fault      |
      | Snow          | Snow damage | Snow Damage                   | Fault      |
      | Snow          | Snow damage | Policyholder Loss of Control  | Fault      |
      | Snow          | Snow damage | Someone Else Loss of Control  | Non Fault  |

  @Ignore
  Scenario: CBPCL-176 TC8 Storm Incident type, cause and subcauses will generate correct fault code
    Then I will see fault based on loss causes
      | incident type | cause        | sub cause                                                           | fault type |
      | Storm         | Storm Damage | Damaged by falling tree / debris e.g. roof tiles - own property     | Fault      |
      | Storm         | Storm Damage | Damaged by falling tree / debris e.g. roof tiles - not own property | Non Fault  |
      | Storm         | Storm Damage | Hail storm damage                                                   | Fault      |
      | Storm         | Storm Damage | Damaged by Lightning                                                | Fault      |
      | Storm         | Storm Damage | Storm Damage                                                        | Fault      |

  @Ignore
  Scenario: CBPCL-176 TC10 Windscreen Incident type, cause and subcauses will generate correct fault code
    Then I will see fault based on loss causes
      | incident type | cause   | sub cause | fault type |
      | Windscreen    | Repair  | Repair    | Fault      |
      | Windscreen    | Replace | Replace   | Fault      |

  @Ignore
  Scenario: CBPCL-176 TC9 Theft Incident type, cause and subcauses will generate correct fault code
    Then I will see fault based on loss causes
      | incident type | cause              | sub cause                                               | fault type |
      | Theft         | Theft From Vehicle | Audio from locked vehicle                               | Fault      |
      | Theft         | Theft From Vehicle | Audio from unlocked vehicle                             | Fault      |
      | Theft         | Theft From Vehicle | Stolen by force / threat of violence / deception        | Fault      |
      | Theft         | Theft From Vehicle | Personal items from locked vehicle                      | Fault      |
      | Theft         | Theft From Vehicle | Personal items from unlocked vehicle                    | Fault      |
      | Theft         | Theft From Vehicle | Bodywork parts stolen from locked vehicle               | Fault      |
      | Theft         | Theft From Vehicle | Satellite Navigation stolen from locked vehicle         | Fault      |
      | Theft         | Theft From Vehicle | Satellite Navigation stolen from unlocked vehicle       | Fault      |
      | Theft         | Theft From Vehicle | Theft Of wheels                                         | Fault      |
      | Theft         | Theft Unrecovered  | Stolen by force / threat of violence / deception        | Fault      |
      | Theft         | Theft Unrecovered  | Stolen whilst parked on the road - outside own home     | Fault      |
      | Theft         | Theft Unrecovered  | Stolen whilst parked on the road - not outside own home | Fault      |
      | Theft         | Theft Unrecovered  | From driveway - no locked gates                         | Fault      |
      | Theft         | Theft Unrecovered  | From driveway - secured by locked gates                 | Fault      |
      | Theft         | Theft Unrecovered  | From locked garage                                      | Fault      |
      | Theft         | Theft Unrecovered  | From unlocked garage                                    | Fault      |
      | Theft         | Theft Recovered    | Stolen by force / threat of violence / deception        | Fault      |
      | Theft         | Theft Recovered    | Stolen whilst parked on the road - outside own home     | Fault      |
      | Theft         | Theft Recovered    | Stolen whilst parked on the road - not outside own home | Fault      |
      | Theft         | Theft Recovered    | From driveway - no locked gates                         | Fault      |
      | Theft         | Theft Recovered    | From driveway - secured by locked gates                 | Fault      |
      | Theft         | Theft Recovered    | From locked garage                                      | Fault      |
      | Theft         | Theft Recovered    | From unlocked garage                                    | Fault      |
      | Theft         | Attempted Theft    | Boot damaged / forced open                              | Fault      |
      | Theft         | Attempted Theft    | Door forced/lock drilled out/lock forced                | Fault      |
      | Theft         | Attempted Theft    | Rear window broken in an attempt to gain entry          | Fault      |
      | Theft         | Attempted Theft    | Side window broken in an attempt to gain entry          | Fault      |
      | Theft         | Attempted Theft    | Steering lock damaged/forced                            | Fault      |
