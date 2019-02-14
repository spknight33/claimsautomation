
Feature: Validation at step3 of FNOL

  Background: 
    Given  I use test data set "regression_set1"
    Given As a "ClaimsHandler" I am at step2 for FNOL

@Ignore @passed
  Scenario: CBPCL-200  TC10-part1 Fail step3 Validation when IncidentType/Cause/Subcause requires an INSURED VEHICLE incident and none is present
    And I complete step2 for FNOL without insured vehicle
    When I select the loss cause types and try to proceed past step3 I will see the validation error message "Add insured vehicle"
      | incident type      | cause                                                | sub cause                                                                                                        |
      | Theft              | Theft From Vehicle                                   | Audio from locked vehicle                                                                                        |
      | Theft              | Theft From Vehicle                                   | Audio from unlocked vehicle                                                                                      |
      | Theft              | Theft From Vehicle                                   | Stolen by force / threat of violence / deception                                                                 |
      | Theft              | Theft From Vehicle                                   | Personal items from locked vehicle                                                                               |
      | Theft              | Theft From Vehicle                                   | Personal items from unlocked vehicle                                                                             |
      | Theft              | Theft From Vehicle                                   | Bodywork parts stolen from locked vehicle                                                                        |
      | Theft              | Theft From Vehicle                                   | Satellite Navigation stolen from locked vehicle                                                                  |
      | Theft              | Theft From Vehicle                                   | Satellite Navigation stolen from unlocked vehicle                                                                |
      | Theft              | Theft From Vehicle                                   | Theft Of wheels                                                                                                  |
      | Theft              | Theft Unrecovered                                    | Stolen by force / threat of violence / deception                                                                 |
      | Theft              | Theft Unrecovered                                    | Stolen whilst parked on the road - outside own home                                                              |
      | Theft              | Theft Unrecovered                                    | Stolen whilst parked on the road - not outside own home                                                          |
      | Theft              | Theft Unrecovered                                    | From driveway - no locked gates                                                                                  |
      | Theft              | Theft Unrecovered                                    | From driveway - secured by locked gates                                                                          |
      | Theft              | Theft Unrecovered                                    | From locked garage                                                                                               |
      | Theft              | Theft Unrecovered                                    | From unlocked garage                                                                                             |
      | Theft              | Theft Recovered                                      | Stolen by force / threat of violence / deception                                                                 |
      | Theft              | Theft Recovered                                      | Stolen whilst parked on the road - outside own home                                                              |
      | Theft              | Theft Recovered                                      | Stolen whilst parked on the road - not outside own home                                                          |
      | Theft              | Theft Recovered                                      | From driveway - no locked gates                                                                                  |
      | Theft              | Theft Recovered                                      | From driveway - secured by locked gates                                                                          |
      | Theft              | Theft Recovered                                      | From locked garage                                                                                               |
      | Theft              | Theft Recovered                                      | From unlocked garage                                                                                             |
      | Theft              | Attempted Theft                                      | Boot damaged / forced open                                                                                       |
      | Theft              | Attempted Theft                                      | Door forced/lock drilled out/lock forced                                                                         |
      | Theft              | Attempted Theft                                      | Rear window broken in an attempt to gain entry                                                                   |
      | Theft              | Attempted Theft                                      | Side window broken in an attempt to gain entry                                                                   |
      | Theft              | Attempted Theft                                      | Steering lock damaged/forced                                                                                     |
      | Storm              | Storm Damage                                         | Damaged by falling tree / Debris e.g. roof tiles - own property                                                  |
      | Storm              | Storm Damage                                         | Damaged by falling tree / Debris e.g. roof tiles - not own property                                              |
      | Storm              | Storm Damage                                         | Hail storm damage                                                                                                |
      | Storm              | Storm Damage                                         | Damaged by Lightning                                                                                             |
      | Storm              | Storm Damage                                         | Storm Damage                                                                                                     |
      | Snow               | Snow damage                                          | Damage Caused by a Snow Slide                                                                                    |
      | Snow               | Snow damage                                          | Snow Damage                                                                                                      |
      | Snow               | Snow damage                                          | Policyholder Loss of Control                                                                                     |
      | Snow               | Snow damage                                          | Someone Else Loss of Control                                                                                     |
      | Misfuelling        | Misfuelling                                          | Misfuelling - Diesel into Petrol                                                                                 |
      | Misfuelling        | Misfuelling                                          | Misfuelling - Petrol into Diesel                                                                                 |
      | Malicious Damage   | Malicious Damage                                     | Corrosive Liquid thrown at / deposited on the car                                                                |
      | Malicious Damage   | Malicious Damage                                     | Bodywork damaged                                                                                                 |
      | Malicious Damage   | Malicious Damage                                     | Mechanical components damaged                                                                                    |
      | Malicious Damage   | Malicious Damage                                     | Fuel tank damaged - contaminated                                                                                 |
      | Malicious Damage   | Malicious Damage                                     | Interior damaged                                                                                                 |
      | Malicious Damage   | Malicious Damage                                     | Roof slashed - damaged (convertible/cabrio)                                                                      |
      | Malicious Damage   | Malicious Damage                                     | Tyres slashed - damaged                                                                                          |
      | Malicious Damage   | Riot or Civil Commotion                              | Riot / civil commotion - Less than 12 people                                                                     |
      | Malicious Damage   | Riot or Civil Commotion                              | Riot / civil commotion - More than 12 people                                                                     |
      | Flood/Water Damage | Flood / Water Damage                                 | Attempted to drive through Flooded area - fresh water                                                            |
      | Flood/Water Damage | Flood / Water Damage                                 | Attempted to drive through Flooded area - sea water                                                              |
      | Flood/Water Damage | Flood / Water Damage                                 | Vehicle immersed in fresh water                                                                                  |
      | Flood/Water Damage | Flood / Water Damage                                 | Vehicle immersed in sea water                                                                                    |
      | Fire               | Vehicle Damaged By Fire                              | Arson attack                                                                                                     |
      | Fire               | Vehicle Damaged By Fire                              | Dropped cigarette/match/lighter                                                                                  |
      | Fire               | Vehicle Damaged By Fire                              | Garage fire                                                                                                      |
      | Fire               | Vehicle Damaged By Fire                              | Manufacturer defect                                                                                              |
      | Fire               | Vehicle Damaged By Fire                              | Whilst undergoing DIY mechanical repair                                                                          |
      | Fire               | Vehicle Damaged By Fire                              | Whilst undergoing mechanical repair by third party                                                               |
      | Fire               | Vehicle Damaged By Fire                              | Petrol leakage (whilst idling)                                                                                   |
      | Fire               | Vehicle Damaged By Fire                              | Petrol leakage (whilst travelling)                                                                               |
      | Fire               | Vehicle Damaged By Fire                              | Parked next to or close by a property on fire                                                                    |
      | Fire               | Vehicle Damaged By Fire                              | Parked next to or close by a vehicle on fire                                                                     |
      | Fire               | Vehicle Damaged By Fire                              | Whilst undergoing DIY structural repair, including welding                                                       |
      | Fire               | Vehicle Damaged By Fire                              | Whilst undergoing structural repair, including welding, by third party                                           |
      | Fire               | Vehicle Damaged By Fire                              | Wiring fault                                                                                                     |
      | Accident           | Accident Involving Animal                            | Collided with animal - owner known                                                                               |
      | Accident           | Accident Involving Animal                            | Collided with animal - owner unknown                                                                             |
      | Accident           | Accident Involving Animal                            | Damage caused by vermin / birds                                                                                  |
      | Accident           | Accident Involving Animal                            | Swerved to avoid an animal which ran into the road, collided with parked vehicle                                 |
      | Accident           | Accident Involving Animal                            | Swerved to avoid an animal which ran into the road, collided with an oncoming vehicle                            |
      | Accident           | Accident Involving Animal                            | Swerved to avoid an animal - vehicle left road                                                                   |
      | Accident           | Accident Involving Cyclist                           | Struck Cyclist crossing                                                                                          |
      | Accident           | Accident Involving Cyclist                           | Lost control due to mechanical failure                                                                           |
      | Accident           | Accident Involving Cyclist                           | Struck Cyclist turning left                                                                                      |
      | Accident           | Accident Involving Cyclist                           | Struck Cyclist turning right                                                                                     |
      | Accident           | Accident Involving Cyclist                           | Struck Cyclist whilst passing                                                                                    |
      | Accident           | Accident Involving Pedestrian                        | Struck pedestrian crossing from nearside from between parked vehicles                                            |
      | Accident           | Accident Involving Pedestrian                        | Struck pedestrian on pedestrian crossing                                                                         |
      | Accident           | Accident Involving Pedestrian                        | Struck pedestrian crossing road                                                                                  |
      | Accident           | Accident Involving Pedestrian                        | Struck pedestrian/child whilst reversing                                                                         |
      | Accident           | Accident Involving Pedestrian                        | Struck pedestrian on pelican crossing - lights in our favour                                                     |
      | Accident           | Accident Involving Pedestrian                        | Struck pedestrian on pelican crossing - lights not in our favour                                                 |
      | Accident           | Car Door Open                                        | Third party opened car door into path of insured                                                                 |
      | Accident           | Car Door Open                                        | Insured opened car door into path of passing third party                                                         |
      | Accident           | Car Door Open                                        | Insured door already open when hit by third party                                                                |
      | Accident           | Caused By Debris On The Road                         | Third party vehicle damaged by Debris from insured vehicle                                                       |
      | Accident           | Caused By Debris On The Road                         | Debris from known third party                                                                                    |
      | Accident           | Caused By Debris On The Road                         | Debris from unknown third party                                                                                  |
      | Accident           | Changing Lanes                                       | Insured failed to notice third party vehicle                                                                     |
      | Accident           | Changing Lanes                                       | Swerved to avoid a vehicle which did not stop and collided with a third party                                    |
      | Accident           | Changing Lanes                                       | Swerved to avoid a vehicle which braked suddenly and collided with third party                                   |
      | Accident           | Changing Lanes                                       | Third party failed to notice Insured                                                                             |
      | Accident           | Changing Lanes                                       | Third party swerved into my path.                                                                                |
      | Accident           | Collided With Fixed Object                           | Having swerved to avoid an animal which ran across the road                                                      |
      | Accident           | Collided With Fixed Object                           | Having swerved to avoid a pedestrian crossing the road                                                           |
      | Accident           | Collided With Fixed Object                           | Having had attention distracted                                                                                  |
      | Accident           | Collided With Fixed Object                           | Basic error of judgement                                                                                         |
      | Accident           | Collided With Fixed Object                           | Having lost concentration due to fatigue                                                                         |
      | Accident           | Collided With Fixed Object                           | Lost control due to mechanical failure                                                                           |
      | Accident           | Collided With Fixed Object                           | Lost control due to black ice - adverse weather conditions                                                       |
      | Accident           | Collided With Parked Third Party Vehicle at Roadside | Having had attention distracted                                                                                  |
      | Accident           | Collided With Parked Third Party Vehicle at Roadside | Having lost concentration due to fatigue                                                                         |
      | Accident           | Collided With Parked Third Party Vehicle at Roadside | Basic error of judgement                                                                                         |
      | Accident           | Collided With Parked Third Party Vehicle at Roadside | Lost control due to mechanical failure                                                                           |
      | Accident           | Collided With Parked Third Party Vehicle at Roadside | Lost control due to black ice - adverse weather conditions                                                       |
      | Accident           | Collided With Parked Third Party Vehicle at Roadside | Having swerved to avoid an animal which ran across the road                                                      |
      | Accident           | Collided With Parked Third Party Vehicle at Roadside | Having swerved to avoid a pedestrian crossing the road                                                           |
      | Accident           | Collision At Roundabout                              | Entering roundabout collided with third party vehicle from right                                                 |
      | Accident           | Collision At Roundabout                              | Hit in rear by third party vehicle whilst waiting to enter roundabout                                            |
      | Accident           | Collision At Roundabout                              | Hit in rear by third party vehicle whilst negotiating roundabout                                                 |
      | Accident           | Collision At Roundabout                              | Collided with nearside of third party vehicle whilst negotiating a roundabout                                    |
      | Accident           | Collision At Roundabout                              | Collided with offside of third party vehicle when attempting to leave roundabout                                 |
      | Accident           | Collision At Roundabout                              | Hit rear of third party vehicle whilst negotiating roundabout                                                    |
      | Accident           | Collision At Roundabout                              | Hit rear of third party vehicle who was waiting to enter roundabout                                              |
      | Accident           | Collision At Roundabout                              | Negotiating roundabout - when third party vehicle entered from left                                              |
      | Accident           | Collision At Roundabout                              | Third party vehicle changed lanes without warning                                                                |
      | Accident           | Collision At 'T' Junction                            | Insured emerged from minor road into path of third party TP gave misleading signal.                              |
      | Accident           | Collision At 'T' Junction                            | Insured emerged from minor road into path of third party                                                         |
      | Accident           | Collision At 'T' Junction                            | Third party vehicle emerged from minor road into path of insured who was overtaking a line of stationary traffic |
      | Accident           | Collision At 'T' Junction                            | Insured turned left as third party vehicle attempted to pass on nearside                                         |
      | Accident           | Collision At 'T' Junction                            | Insured turned right across path of oncoming third party vehicle                                                 |
      | Accident           | Collision At 'T' Junction                            | Insured turned right as third party vehicle attempted to pass on offside                                         |
      | Accident           | Collision At 'T' Junction                            | Third party vehicle emerged from minor road into path of insured                                                 |
      | Accident           | Collision At 'T' Junction                            | Insured turning right out of minor road - into path of TP overtaking a line of stationary traffic                |
      | Accident           | Collision At 'T' Junction                            | Third party turned right as insured attempted to pass on offside                                                 |
      | Accident           | Collision At 'T' Junction                            | Third party turned left as insured attempted to pass on nearside                                                 |
      | Accident           | Collision At 'T' Junction                            | Oncoming third party vehicle turned right across path of insured                                                 |

  @Ignore @passed
  Scenario: CBPCL-200  TC10-part2 Fail step3 Validation when IncidentType/Cause/Subcause requires just an INSURED VEHICLE incident and none is present
    And I complete step2 for FNOL without insured vehicle
    When I select the loss cause types and try to proceed past step3 I will see the validation error message "Add insured vehicle"
      | incident type | cause                               | sub cause                                                                                     |
      | Accident      | Collision At 'X' Roads              | Governed by 'give way' signs - Insured on major road                                          |
      | Accident      | Collision At 'X' Roads              | Governed by 'give way' signs - Insured on minor road                                          |
      | Accident      | Collision At 'X' Roads              | Insured turned right across path of oncoming third party vehicle - no filter light            |
      | Accident      | Collision At 'X' Roads              | Insured turning left hit by third party                                                       |
      | Accident      | Collision At 'X' Roads              | Insured turning right across path of third party                                              |
      | Accident      | Collision At 'X' Roads              | Neither party had right of way                                                                |
      | Accident      | Collision At 'X' Roads              | Governed by 'stop' signs - Insured on major road                                              |
      | Accident      | Collision At 'X' Roads              | Governed by 'stop' signs - Insured on minor road                                              |
      | Accident      | Collision At 'X' Roads              | Oncoming third party vehicle turned right across path of insured - no filter light            |
      | Accident      | Collision At 'X' Roads              | Third party turning left (no signal) hit by Insured                                           |
      | Accident      | Collision At 'X' Roads              | Third party turning left (having signalled correctly) hit by Insured                          |
      | Accident      | Collision At 'X' Roads              | Third party turning right (no signal) across path of Insured                                  |
      | Accident      | Collision At 'X' Roads              | Third party turning right (having signalled correctly) across path of insured                 |
      | Accident      | Collision At 'X' Roads              | Governed by traffic lights - Insured crossed on amber                                         |
      | Accident      | Collision At 'X' Roads              | Governed by traffic lights - Insured crossed on green                                         |
      | Accident      | Collision At 'X' Roads              | Governed by traffic lights - Insured crossed on red                                           |
      | Accident      | Collision Between Oncoming Vehicles | Three lane carriage way - no priorities                                                       |
      | Accident      | Collision Between Oncoming Vehicles | Three lane carriage way - priority with insured                                               |
      | Accident      | Collision Between Oncoming Vehicles | Three lane carriage way - priority with third party                                           |
      | Accident      | Collision Between Oncoming Vehicles | Insured entered 'one way' street the wrong way and collided with oncoming third party vehicle |
      | Accident      | Collision Between Oncoming Vehicles | Insured turned right across path of oncoming third party vehicle                              |
      | Accident      | Collision Between Oncoming Vehicles | Insured lost control and collided with oncoming third party vehicle                           |
      | Accident      | Collision Between Oncoming Vehicles | In narrow lane - neither party had right of way                                               |
      | Accident      | Collision Between Oncoming Vehicles | On bend in narrow lane - neither party had right of way                                       |
      | Accident      | Collision Between Oncoming Vehicles | Oncoming third party vehicle lost control and collided with insured                           |
      | Accident      | Collision Between Oncoming Vehicles | Insured vehicle overtaking on wrong side of road collided with oncoming third party vehicle   |
      | Accident      | Collision Between Oncoming Vehicles | Collided with oncoming vehicle in a road reduced in width by parked cars on both sides        |
      | Accident      | Collision Between Oncoming Vehicles | Passing parked vehicle(s) in collision with oncoming third party                              |
      | Accident      | Collision Between Oncoming Vehicles | Collided with an oncoming third party who was passing parked vehicle(s)                       |
      | Accident      | Collision Between Oncoming Vehicles | Having swerved to avoid a pedestrian                                                          |
      | Accident      | Collision Between Oncoming Vehicles | Oncoming third party vehicle entered 'one way' street the wrong way and collided with Insured |
      | Accident      | Collision Between Oncoming Vehicles | Oncoming third party vehicle overtaking on wrong side of road collided with insured           |
      | Accident      | Collision Between Oncoming Vehicles | Oncoming third party vehicle turned right across path of insured                              |
      | Accident      | Collision In Car Park               | Both parties reversing                                                                        |
      | Accident      | Collision In Car Park               | Having swerved to avoid a pedestrian                                                          |
      | Accident      | Collision In Car Park               | Having had attention distracted                                                               |
      | Accident      | Collision In Car Park               | Lost control due to mechanical failure                                                        |
      | Accident      | Collision In Car Park               | Having swerved to avoid another vehicle which did not stop                                    |
      | Accident      | Collision In Car Park               | Lost control due to black ice - adverse weather conditions                                    |
      | Accident      | Collision In Car Park               | Basic error of judgement                                                                      |
      | Accident      | Collision In Car Park               | Insured reversed into third party vehicle                                                     |
      | Accident      | Collision In Car Park               | Third party reversed into insured vehicle in a car park                                       |
      | Accident      | Collision Whilst Reversing          | Both parties reversing                                                                        |
      | Accident      | Collision Whilst Reversing          | Collided with bollard                                                                         |
      | Accident      | Collision Whilst Reversing          | Lost control due to black ice - adverse weather conditions                                    |
      | Accident      | Collision Whilst Reversing          | Lost control due to mechanical failure                                                        |
      | Accident      | Collision Whilst Reversing          | Collided with moving third party vehicle                                                      |
      | Accident      | Collision Whilst Reversing          | Other innate object                                                                           |
      | Accident      | Collision Whilst Reversing          | Collided with parked third party vehicle                                                      |
      | Accident      | Collision Whilst Reversing          | Struck pedestrian/child                                                                       |
      | Accident      | Collision Whilst Reversing          | Other innate object                                                                           |
      | Accident      | Collision Whilst Reversing          | Insured reversed into third party vehicle                                                     |
      | Accident      | Collision Whilst Reversing          | Third party reversed into insured vehicle                                                     |
      | Accident      | Collision Whilst Reversing          | Third party was reversing and colliding with our correctly proceeding vehicle                 |
      | Accident      | Hit in Rear By Third Party          | Whilst waiting to enter main road at 'T' junction                                             |
      | Accident      | Hit in Rear By Third Party          | Hit in rear and pushed into passing vehicle                                                   |
      | Accident      | Hit in Rear By Third Party          | Hit in rear and pushed into vehicle in front                                                  |
      | Accident      | Hit in Rear By Third Party          | Hit In Rear while correctly proceeding along the road                                         |
      | Accident      | Hit in Rear By Third Party          | Whilst slowing down for an animal crossing the road                                           |
      | Accident      | Hit in Rear By Third Party          | Whilst slowing down for people crossing the road                                              |
      | Accident      | Hit in Rear By Third Party          | Whilst stationary at 'X' roads                                                                |
      | Accident      | Hit Rear Of Third Party             | Hit rear of vehicle stationary at 'X' roads                                                   |
      | Accident      | Hit Rear Of Third Party             | Hit rear of vehicle while correctly proceeding along the road                                 |
      | Accident      | Hit Rear Of Third Party             | Hit rear of vehicle whilst in line of slow moving traffic                                     |
      | Accident      | Hit Rear Of Third Party             | Hit rear of vehicle stationary in line of traffic                                             |
      | Accident      | Hit Rear Of Third Party             | Hit rear of vehicle and pushed into passing vehicle                                           |
      | Accident      | Hit Rear Of Third Party             | Hit rear of vehicle turning off main road                                                     |
      | Accident      | Hit Rear Of Third Party             | Hit rear of vehicle negotiating roundabout                                                    |
      | Accident      | Hit Rear Of Third Party             | Hit rear of vehicle slowing down for an animal crossing the road                              |
      | Accident      | Hit Rear Of Third Party             | Hit rear of vehicle whilst slowing down for people crossing the road                          |
      | Accident      | Hit Rear Of Third Party             | Hit rear of vehicle waiting to enter main road at 'T' junction                                |
      | Accident      | Hit Rear Of Third Party             | Hit rear of vehicle waiting to enter roundabout                                               |


  Scenario: CBPCL-200  TC10-part3 Fail step3 Validation when IncidentType/Cause/Subcause requires just an INSURED VEHICLE incident and none is present
    And I complete step2 for FNOL without insured vehicle
    When I select the loss cause types and try to proceed past step3 I will see the validation error message "Add insured vehicle"
      | incident type | cause                                 | sub cause                                                                   |
      | Accident      | Insured Vehicle Damaged Whilst Parked | In private car park                                                         |
      | Accident      | Insured Vehicle Damaged Whilst Parked | In public car park                                                          |
      | Accident      | Insured Vehicle Damaged Whilst Parked | On road not outside own home                                                |
      | Accident      | Insured Vehicle Damaged Whilst Parked | On road outside own home                                                    |
      | Accident      | Insured Vehicle Damaged Whilst Parked | In works car park                                                           |
      | Accident      | Insured's Vehicle Left Road           | Obstruction / Debris in the road                                            |
      | Accident      | Insured's Vehicle Left Road           | Poor road / weather conditions                                              |
      | Accident      | Joining/Leaving Slip Roads/Motorways  | Insured failed to notice third party vehicle on main road                   |
      | Accident      | Joining/Leaving Slip Roads/Motorways  | Insured failed to give way to traffic on main road                          |
      | Accident      | Joining/Leaving Slip Roads/Motorways  | Insured took wrong exit - collision with third party                        |
      | Accident      | Joining/Leaving Slip Roads/Motorways  | Third party failed to give way to traffic on main road                      |
      | Accident      | Joining/Leaving Slip Roads/Motorways  | Third party failed to notice insured vehicle on main road                   |
      | Accident      | Joining/Leaving Slip Roads/Motorways  | Insured collided with third party who had taken wrong exit                  |
      | Accident      | Loss of Consciousness / Automatism    | Caused by known condition - own damage only                                 |
      | Accident      | Loss of Consciousness / Automatism    | Caused by unknown condition - own damage only                               |
      | Accident      | Loss of Consciousness / Automatism    | Caused by known condition - involving TP vehicle / property                 |
      | Accident      | Loss of Consciousness / Automatism    | Caused by unknown condition - involving TP vehicle / property               |
      | Accident      | Loss Of Control                       | Insured failed to negotiate left hand bend                                  |
      | Accident      | Loss Of Control                       | Insured lost control due to adverse weather conditions                      |
      | Accident      | Loss Of Control                       | Lost Control Human Error                                                    |
      | Accident      | Loss Of Control                       | Lost control due to mechanical failure                                      |
      | Accident      | Loss Of Control                       | Having had attention distracted                                             |
      | Accident      | Loss Of Control                       | Insured failed to negotiate right hand bend                                 |
      | Accident      | Loss Of Control                       | Turning corner into/out of side road - mounted pavement                     |
      | Accident      | Moving From Stationary Position       | Insured into path of third party who gave a misleading signal               |
      | Accident      | Moving From Stationary Position       | Insured out of lay-by into path of third party who gave a misleading signal |
      | Accident      | Moving From Stationary Position       | Insured attempting 'U' turn, collision with third party                     |
      | Accident      | Moving From Stationary Position       | Insured into path of third party                                            |
      | Accident      | Moving From Stationary Position       | Insured out of lay-by into path of third party                              |
      | Accident      | Moving From Stationary Position       | Third party into path of Insured who gave a misleading signal               |
      | Accident      | Moving From Stationary Position       | Third party into path of insured                                            |
      | Accident      | Moving From Stationary Position       | Third Party out of lay-by into path of insured                              |
      | Accident      | Moving From Stationary Position       | Third party out of lay-by into path of insured who gave a misleading signal |
      | Accident      | Moving From Stationary Position       | Third party attempted 'U' turn, collision with insured                      |
      | Accident      | Multiple Vehicle - Shunt              | Third party from side road - multiple collision on main                     |
      | Accident      | Multiple Vehicle - Shunt              | Motorway multiple vehicles                                                  |
      | Accident      | Multiple Vehicle - Shunt              | Insured hit rear of TP forcing it into rear of another                      |
      | Accident      | Multiple Vehicle - Shunt              | Insured struck rear of TP before being hit from behind                      |
      | Accident      | Multiple Vehicle - Shunt              | Insured shunted from rear into TP in front                                  |
      | Accident      | Multiple Vehicle - Shunt              | Insured from side road - multiple collision on main                         |
      | Accident      | Narrow Road Collision                 | Brow of a hill / bridge                                                     |
      | Accident      | Narrow Road Collision                 | Narrow road / country Lane                                                  |
      | Accident      | Narrow Road Collision                 | Insured passing parked cars                                                 |
      | Accident      | Narrow Road Collision                 | Road narrowed by parked cars either side                                    |
      | Accident      | Narrow Road Collision                 | Insured rounding bend                                                       |
      | Accident      | Narrow Road Collision                 | Third party rounding bend                                                   |
      | Accident      | Narrow Road Collision                 | Third party passing parked cars                                             |
      | Accident      | Overtaking                            | Insured from behind hit off side of third party vehicle                     |
      | Accident      | Overtaking                            | Insured hit oncoming third party                                            |
      | Accident      | Overtaking                            | Third Party from behind hit off side of vehicle                             |
      | Accident      | Overtaking                            | Third Party hit oncoming Insured                                            |
      | Accident      | Reported by TP                        | Reported by TP                                                              |
      | Accident      | Unknown                               | Unknown                                                                     |
			| Accident | Hit in Rear By Third Party | Whilst waiting to enter roundabout |
			| Accident | Hit in Rear By Third Party | Whilst stationary in line of traffic |
			| Accident | Hit in Rear By Third Party | Whilst negotiating a roundabout |

@Ignore @passed
  Scenario: CBPCL-200 TC11-PART1 Fail step3 Validation when IncidentType/Cause/Subcause requires an INSURED DRIVER incident but none is present
    And I complete step2 for FNOL
    When I select the loss cause types and try to proceed past step3 I will see the validation error message "Add insured driver"
      | incident type | cause                                                | sub cause                                                                             |
      | Accident      | Accident Involving Animal                            | Collided with animal - owner known                                                    |
      | Accident      | Accident Involving Animal                            | Collided with animal - owner unknown                                                  |
      | Accident      | Accident Involving Animal                            | Damage caused by vermin / birds                                                       |
      | Accident      | Accident Involving Animal                            | Swerved to avoid an animal which ran into the road, collided with parked vehicle      |
      | Accident      | Accident Involving Animal                            | Swerved to avoid an animal which ran into the road, collided with an oncoming vehicle |
      | Accident      | Accident Involving Animal                            | Swerved to avoid an animal - vehicle left road                                        |
      | Accident      | Accident Involving Cyclist                           | Struck Cyclist crossing                                                               |
      | Accident      | Accident Involving Cyclist                           | Lost control due to mechanical failure                                                |
      | Accident      | Accident Involving Cyclist                           | Struck Cyclist turning left                                                           |
      | Accident      | Accident Involving Cyclist                           | Struck Cyclist turning right                                                          |
      | Accident      | Accident Involving Cyclist                           | Struck Cyclist whilst passing                                                         |
      | Accident      | Accident Involving Pedestrian                        | Struck pedestrian crossing from nearside from between parked vehicles                 |
      | Accident      | Accident Involving Pedestrian                        | Struck pedestrian on pedestrian crossing                                              |
      | Accident      | Accident Involving Pedestrian                        | Struck pedestrian crossing road                                                       |
      | Accident      | Accident Involving Pedestrian                        | Struck pedestrian/child whilst reversing                                              |
      | Accident      | Accident Involving Pedestrian                        | Struck pedestrian on pelican crossing - lights in our favour                          |
      | Accident      | Accident Involving Pedestrian                        | Struck pedestrian on pelican crossing - lights not in our favour                      |
      | Accident      | Car Door Open                                        | Third party opened car door into path of insured                                      |
      | Accident      | Car Door Open                                        | Insured opened car door into path of passing third party                              |
      | Accident      | Car Door Open                                        | Insured door already open when hit by third party                                     |
      | Accident      | Caused By Debris On The Road                         | Third party vehicle damaged by Debris from insured vehicle                            |
      | Accident      | Caused By Debris On The Road                         | Debris from known third party                                                         |
      | Accident      | Caused By Debris On The Road                         | Debris from unknown third party                                                       |
      | Accident      | Changing Lanes                                       | Insured failed to notice third party vehicle                                          |
      | Accident      | Changing Lanes                                       | Swerved to avoid a vehicle which did not stop and collided with a third party         |
      | Accident      | Changing Lanes                                       | Swerved to avoid a vehicle which braked suddenly and collided with third party        |
      | Accident      | Changing Lanes                                       | Third party failed to notice Insured                                                  |
      | Accident      | Changing Lanes                                       | Third party swerved into my path.                                                     |
      | Accident      | Collided With Fixed Object                           | Having swerved to avoid an animal which ran across the road                           |
      | Accident      | Collided With Fixed Object                           | Having swerved to avoid a pedestrian crossing the road                                |
      | Accident      | Collided With Fixed Object                           | Having had attention distracted                                                       |
      | Accident      | Collided With Fixed Object                           | Basic error of judgement                                                              |
      | Accident      | Collided With Fixed Object                           | Having lost concentration due to fatigue                                              |
      | Accident      | Collided With Fixed Object                           | Lost control due to mechanical failure                                                |
      | Accident      | Collided With Fixed Object                           | Lost control due to black ice - adverse weather conditions                            |
      | Accident      | Collided With Parked Third Party Vehicle at Roadside | Having had attention distracted                                                       |
      | Accident      | Collided With Parked Third Party Vehicle at Roadside | Having lost concentration due to fatigue                                              |
      | Accident      | Collided With Parked Third Party Vehicle at Roadside | Basic error of judgement                                                              |
      | Accident      | Collided With Parked Third Party Vehicle at Roadside | Lost control due to mechanical failure                                                |
      | Accident      | Collided With Parked Third Party Vehicle at Roadside | Lost control due to black ice - adverse weather conditions                            |
      | Accident      | Collided With Parked Third Party Vehicle at Roadside | Having swerved to avoid an animal which ran across the road                           |
      | Accident      | Collided With Parked Third Party Vehicle at Roadside | Having swerved to avoid a pedestrian crossing the road                                |

@Ignore @passed
  Scenario: CBPCL-200 TC11-PART2 Fail step3 Validation when IncidentType/Cause/Subcause requires an INSURED DRIVER incident but none is present
    And I complete step2 for FNOL
    When I select the loss cause types and try to proceed past step3 I will see the validation error message "Add insured driver"
      | incident type | cause                               | sub cause                                                                                                        |
      | Accident      | Collision At Roundabout             | Entering roundabout collided with third party vehicle from right                                                 |
      | Accident      | Collision At Roundabout             | Hit in rear by third party vehicle whilst waiting to enter roundabout                                            |
      | Accident      | Collision At Roundabout             | Hit in rear by third party vehicle whilst negotiating roundabout                                                 |
      | Accident      | Collision At Roundabout             | Collided with nearside of third party vehicle whilst negotiating a roundabout                                    |
      | Accident      | Collision At Roundabout             | Collided with offside of third party vehicle when attempting to leave roundabout                                 |
      | Accident      | Collision At Roundabout             | Hit rear of third party vehicle whilst negotiating roundabout                                                    |
      | Accident      | Collision At Roundabout             | Hit rear of third party vehicle who was waiting to enter roundabout                                              |
      | Accident      | Collision At Roundabout             | Negotiating roundabout - when third party vehicle entered from left                                              |
      | Accident      | Collision At Roundabout             | Third party vehicle changed lanes without warning                                                                |
      | Accident      | Collision At 'T' Junction           | Insured emerged from minor road into path of third party TP gave misleading signal.                              |
      | Accident      | Collision At 'T' Junction           | Insured emerged from minor road into path of third party                                                         |
      | Accident      | Collision At 'T' Junction           | Third party vehicle emerged from minor road into path of insured who was overtaking a line of stationary traffic |
      | Accident      | Collision At 'T' Junction           | Insured turned left as third party vehicle attempted to pass on nearside                                         |
      | Accident      | Collision At 'T' Junction           | Insured turned right across path of oncoming third party vehicle                                                 |
      | Accident      | Collision At 'T' Junction           | Insured turned right as third party vehicle attempted to pass on offside                                         |
      | Accident      | Collision At 'T' Junction           | Third party vehicle emerged from minor road into path of insured                                                 |
      | Accident      | Collision At 'T' Junction           | Insured turning right out of minor road - into path of TP overtaking a line of stationary traffic                |
      | Accident      | Collision At 'T' Junction           | Third party turned right as insured attempted to pass on offside                                                 |
      | Accident      | Collision At 'T' Junction           | Third party turned left as insured attempted to pass on nearside                                                 |
      | Accident      | Collision At 'T' Junction           | Oncoming third party vehicle turned right across path of insured                                                 |
      | Accident      | Collision At 'X' Roads              | Governed by 'give way' signs - Insured on major road                                                             |
      | Accident      | Collision At 'X' Roads              | Governed by 'give way' signs - Insured on minor road                                                             |
      | Accident      | Collision At 'X' Roads              | Insured turned right across path of oncoming third party vehicle - no filter light                               |
      | Accident      | Collision At 'X' Roads              | Insured turning left hit by third party                                                                          |
      | Accident      | Collision At 'X' Roads              | Insured turning right across path of third party                                                                 |
      | Accident      | Collision At 'X' Roads              | Neither party had right of way                                                                                   |
      | Accident      | Collision At 'X' Roads              | Governed by 'stop' signs - Insured on major road                                                                 |
      | Accident      | Collision At 'X' Roads              | Governed by 'stop' signs - Insured on minor road                                                                 |
      | Accident      | Collision At 'X' Roads              | Oncoming third party vehicle turned right across path of insured - no filter light                               |
      | Accident      | Collision At 'X' Roads              | Third party turning left (no signal) hit by Insured                                                              |
      | Accident      | Collision At 'X' Roads              | Third party turning left (having signalled correctly) hit by Insured                                             |
      | Accident      | Collision At 'X' Roads              | Third party turning right (no signal) across path of Insured                                                     |
      | Accident      | Collision At 'X' Roads              | Third party turning right (having signalled correctly) across path of insured                                    |
      | Accident      | Collision At 'X' Roads              | Governed by traffic lights - Insured crossed on amber                                                            |
      | Accident      | Collision At 'X' Roads              | Governed by traffic lights - Insured crossed on green                                                            |
      | Accident      | Collision At 'X' Roads              | Governed by traffic lights - Insured crossed on red                                                              |
      | Accident      | Collision Between Oncoming Vehicles | Three lane carriage way - no priorities                                                                          |
      | Accident      | Collision Between Oncoming Vehicles | Three lane carriage way - priority with insured                                                                  |
      | Accident      | Collision Between Oncoming Vehicles | Three lane carriage way - priority with third party                                                              |
      | Accident      | Collision Between Oncoming Vehicles | Insured entered 'one way' street the wrong way and collided with oncoming third party vehicle                    |
      | Accident      | Collision Between Oncoming Vehicles | Insured turned right across path of oncoming third party vehicle                                                 |
      | Accident      | Collision Between Oncoming Vehicles | Insured lost control and collided with oncoming third party vehicle                                              |
      | Accident      | Collision Between Oncoming Vehicles | In narrow lane - neither party had right of way                                                                  |
      | Accident      | Collision Between Oncoming Vehicles | On bend in narrow lane - neither party had right of way                                                          |
      | Accident      | Collision Between Oncoming Vehicles | Oncoming third party vehicle lost control and collided with insured                                              |
      | Accident      | Collision Between Oncoming Vehicles | Insured vehicle overtaking on wrong side of road collided with oncoming third party vehicle                      |
      | Accident      | Collision Between Oncoming Vehicles | Collided with oncoming vehicle in a road reduced in width by parked cars on both sides                           |
      | Accident      | Collision Between Oncoming Vehicles | Passing parked vehicle(s) in collision with oncoming third party                                                 |
      | Accident      | Collision Between Oncoming Vehicles | Collided with an oncoming third party who was passing parked vehicle(s)                                          |
      | Accident      | Collision Between Oncoming Vehicles | Having swerved to avoid a pedestrian                                                                             |
      | Accident      | Collision Between Oncoming Vehicles | Oncoming third party vehicle entered 'one way' street the wrong way and collided with Insured                    |
      | Accident      | Collision Between Oncoming Vehicles | Oncoming third party vehicle overtaking on wrong side of road collided with insured                              |
      | Accident      | Collision Between Oncoming Vehicles | Oncoming third party vehicle turned right across path of insured                                                 |
      | Accident      | Collision In Car Park               | Both parties reversing                                                                                           |
      | Accident      | Collision In Car Park               | Having swerved to avoid a pedestrian                                                                             |
      | Accident      | Collision In Car Park               | Having had attention distracted                                                                                  |
      | Accident      | Collision In Car Park               | Lost control due to mechanical failure                                                                           |
      | Accident      | Collision In Car Park               | Having swerved to avoid another vehicle which did not stop                                                       |
      | Accident      | Collision In Car Park               | Lost control due to black ice - adverse weather conditions                                                       |
      | Accident      | Collision In Car Park               | Basic error of judgement                                                                                         |
      | Accident      | Collision In Car Park               | Insured reversed into third party vehicle                                                                        |
      | Accident      | Collision In Car Park               | Third party reversed into insured vehicle in a car park                                                          |
      | Accident      | Collision Whilst Reversing          | Both parties reversing                                                                                           |
      | Accident      | Collision Whilst Reversing          | Collided with bollard                                                                                            |
      | Accident      | Collision Whilst Reversing          | Lost control due to black ice - adverse weather conditions                                                       |
      | Accident      | Collision Whilst Reversing          | Lost control due to mechanical failure                                                                           |
      | Accident      | Collision Whilst Reversing          | Collided with moving third party vehicle                                                                         |
      | Accident      | Collision Whilst Reversing          | Other innate object                                                                                              |
      | Accident      | Collision Whilst Reversing          | Collided with parked third party vehicle                                                                         |
      | Accident      | Collision Whilst Reversing          | Struck pedestrian/child                                                                                          |
      | Accident      | Collision Whilst Reversing          | Collided with post/pillar/wall                                                                                   |
      | Accident      | Collision Whilst Reversing          | Insured reversed into third party vehicle                                                                        |
      | Accident      | Collision Whilst Reversing          | Third party reversed into insured vehicle                                                                        |
      | Accident      | Collision Whilst Reversing          | Third party was reversing and colliding with our correctly proceeding vehicle                                    |
      | Accident      | Hit in Rear By Third Party          | Whilst waiting to enter main road at 'T' junction                                                                |
      | Accident      | Hit in Rear By Third Party          | Hit in rear and pushed into passing vehicle                                                                      |
      | Accident      | Hit in Rear By Third Party          | Hit in rear and pushed into vehicle in front                                                                     |
      | Accident      | Hit in Rear By Third Party          | Hit In Rear while correctly proceeding along the road                                                            |
      | Accident      | Hit in Rear By Third Party          | Whilst slowing down for an animal crossing the road                                                              |
      | Accident      | Hit in Rear By Third Party          | Whilst slowing down for people crossing the road                                                                 |
      | Accident      | Hit in Rear By Third Party          | Whilst stationary at 'X' roads                                                                                   |

@Ignore @passsed
  Scenario: CBPCL-200 TC11-PART3 Fail step3 Validation when IncidentType/Cause/Subcause requires an INSURED DRIVER incident but none is present
    And I complete step2 for FNOL
    When I select the loss cause types and try to proceed past step3 I will see the validation error message "Add insured driver"
      | incident type      | cause                                | sub cause                                                                   |
      | Accident           | Hit Rear Of Third Party              | Hit rear of vehicle stationary at 'X' roads                                 |
      | Accident           | Hit Rear Of Third Party              | Hit rear of vehicle while correctly proceeding along the road               |
      | Accident           | Hit Rear Of Third Party              | Hit rear of vehicle whilst in line of slow moving traffic                   |
      | Accident           | Hit Rear Of Third Party              | Hit rear of vehicle stationary in line of traffic                           |
      | Accident           | Hit Rear Of Third Party              | Hit rear of vehicle and pushed into passing vehicle                         |
      | Accident           | Hit Rear Of Third Party              | Hit rear of vehicle turning off main road                                   |
      | Accident           | Hit Rear Of Third Party              | Hit rear of vehicle negotiating roundabout                                  |
      | Accident           | Hit Rear Of Third Party              | Hit rear of vehicle slowing down for an animal crossing the road            |
      | Accident           | Hit Rear Of Third Party              | Hit rear of vehicle whilst slowing down for people crossing the road        |
      | Accident           | Hit Rear Of Third Party              | Hit rear of vehicle waiting to enter main road at 'T' junction              |
      | Accident           | Hit Rear Of Third Party              | Hit rear of vehicle waiting to enter roundabout                             |
      | Accident           | Insured's Vehicle Left Road          | Obstruction / Debris in the road                                            |
      | Accident           | Insured's Vehicle Left Road          | Poor road / weather conditions                                              |
      | Accident           | Joining/Leaving Slip Roads/Motorways | Insured failed to notice third party vehicle on main road                   |
      | Accident           | Joining/Leaving Slip Roads/Motorways | Insured failed to give way to traffic on main road                          |
      | Accident           | Joining/Leaving Slip Roads/Motorways | Insured took wrong exit - collision with third party                        |
      | Accident           | Joining/Leaving Slip Roads/Motorways | Third party failed to give way to traffic on main road                      |
      | Accident           | Joining/Leaving Slip Roads/Motorways | Third party failed to notice insured vehicle on main road                   |
      | Accident           | Joining/Leaving Slip Roads/Motorways | Insured collided with third party who had taken wrong exit                  |
      | Accident           | Loss of Consciousness / Automatism   | Caused by known condition - own damage only                                 |
      | Accident           | Loss of Consciousness / Automatism   | Caused by unknown condition - own damage only                               |
      | Accident           | Loss of Consciousness / Automatism   | Caused by known condition - involving TP vehicle / property                 |
      | Accident           | Loss of Consciousness / Automatism   | Caused by unknown condition - involving TP vehicle / property               |
      | Accident           | Loss Of Control                      | Insured failed to negotiate left hand bend                                  |
      | Accident           | Loss Of Control                      | Insured lost control due to adverse weather conditions                      |
      | Accident           | Loss Of Control                      | Lost Control Human Error                                                    |
      | Accident           | Loss Of Control                      | Lost control due to mechanical failure                                      |
      | Accident           | Loss Of Control                      | Having had attention distracted                                             |
      | Accident           | Loss Of Control                      | Insured failed to negotiate right hand bend                                 |
      | Accident           | Loss Of Control                      | Turning corner into/out of side road - mounted pavement                     |
      | Accident           | Moving From Stationary Position      | Insured into path of third party who gave a misleading signal               |
      | Accident           | Moving From Stationary Position      | Insured out of lay-by into path of third party who gave a misleading signal |
      | Accident           | Moving From Stationary Position      | Insured attempting 'U' turn, collision with third party                     |
      | Accident           | Moving From Stationary Position      | Insured into path of third party                                            |
      | Accident           | Moving From Stationary Position      | Insured out of lay-by into path of third party                              |
      | Accident           | Moving From Stationary Position      | Third party into path of Insured who gave a misleading signal               |
      | Accident           | Moving From Stationary Position      | Third party into path of insured                                            |
      | Accident           | Moving From Stationary Position      | Third Party out of lay-by into path of insured                              |
      | Accident           | Moving From Stationary Position      | Third party out of lay-by into path of insured who gave a misleading signal |
      | Accident           | Moving From Stationary Position      | Third party attempted 'U' turn, collision with insured                      |
      | Accident           | Multiple Vehicle - Shunt             | Third party from side road - multiple collision on main                     |
      | Accident           | Multiple Vehicle - Shunt             | Motorway multiple vehicles                                                  |
      | Accident           | Multiple Vehicle - Shunt             | Insured hit rear of TP forcing it into rear of another                      |
      | Accident           | Multiple Vehicle - Shunt             | Insured struck rear of TP before being hit from behind                      |
      | Accident           | Multiple Vehicle - Shunt             | Insured shunted from rear into TP in front                                  |
      | Accident           | Multiple Vehicle - Shunt             | Insured from side road - multiple collision on main                         |
      | Accident           | Narrow Road Collision                | Brow of a hill / bridge                                                     |
      | Accident           | Narrow Road Collision                | Narrow road / country Lane                                                  |
      | Accident           | Narrow Road Collision                | Insured passing parked cars                                                 |
      | Accident           | Narrow Road Collision                | Road narrowed by parked cars either side                                    |
      | Accident           | Narrow Road Collision                | Insured rounding bend                                                       |
      | Accident           | Narrow Road Collision                | Third party rounding bend                                                   |
      | Accident           | Narrow Road Collision                | Third party passing parked cars                                             |
      | Accident           | Overtaking                           | Insured from behind hit off side of third party vehicle                     |
      | Accident           | Overtaking                           | Insured hit oncoming third party                                            |
      | Accident           | Overtaking                           | Third Party from behind hit off side of vehicle                             |
      | Accident           | Overtaking                           | Third Party hit oncoming Insured                                            |
      | Accident           | Reported by TP                       | Reported by TP                                                              |
      | Flood/Water Damage | Flood / Water Damage                 | Attempted to drive through Flooded area - fresh water                       |
      | Flood/Water Damage | Flood / Water Damage                 | Attempted to drive through Flooded area - sea water                         |
      | Snow               | Snow damage                          | Policyholder Loss of Control                                                |
| Accident | Hit in Rear By Third Party | Whilst waiting to enter roundabout |
| Accident | Hit in Rear By Third Party | Whilst stationary in line of traffic |
| Accident | Hit in Rear By Third Party | Whilst negotiating a roundabout |


  @Ignore @passed
  Scenario: CBPCL-200  TC12-PART1 Fail step3 Validation when IncidentType/Cause/Subcause requires a TP VEHICLE incident and none is present
    And I complete step2 for FNOL
    And I select the insureds vehicle at step3
    And I will be on vehicle screen for FNOL
    And I select "AddDriver" on vehicle screen
     And I select the insured as driver of PH vehicle
    And I click ok button on driver screen
    And I click ok button on vehicle screen
    When I select the loss cause types and try to proceed past step3 I will see the validation error message "Add third party vehicle"
      | incident type | cause                               | sub cause                                                                                     |
      | Accident      | Collision In Car Park               | Both parties reversing                                                                        |
      | Accident      | Collision In Car Park               | Third party reversed into insured vehicle in a car park                                       |
      | Accident      | Changing Lanes                      | Insured failed to notice third party vehicle                                                  |
      | Accident      | Changing Lanes                      | Swerved to avoid a vehicle which did not stop and collided with a third party                 |
      | Accident      | Changing Lanes                      | Swerved to avoid a vehicle which braked suddenly and collided with third party                |
      | Accident      | Changing Lanes                      | Third party failed to notice Insured                                                          |
      | Accident      | Changing Lanes                      | Third party swerved into my path.                                                             |
      | Accident      | Collision At 'X' Roads              | Governed by 'give way' signs - Insured on major road                                          |
      | Accident      | Collision At 'X' Roads              | Governed by 'give way' signs - Insured on minor road                                          |
      | Accident      | Collision At 'X' Roads              | Insured turned right across path of oncoming third party vehicle - no filter light            |
      | Accident      | Collision At 'X' Roads              | Insured turning left hit by third party                                                       |
      | Accident      | Collision At 'X' Roads              | Insured turning right across path of third party                                              |
      | Accident      | Collision At 'X' Roads              | Neither party had right of way                                                                |
      | Accident      | Collision At 'X' Roads              | Governed by 'stop' signs - Insured on major road                                              |
      | Accident      | Collision At 'X' Roads              | Governed by 'stop' signs - Insured on minor road                                              |
      | Accident      | Collision At 'X' Roads              | Oncoming third party vehicle turned right across path of insured - no filter light            |
      | Accident      | Collision At 'X' Roads              | Third party turning left (no signal) hit by Insured                                           |
      | Accident      | Collision At 'X' Roads              | Third party turning left (having signalled correctly) hit by Insured                          |
      | Accident      | Collision At 'X' Roads              | Third party turning right (no signal) across path of Insured                                  |
      | Accident      | Collision At 'X' Roads              | Third party turning right (having signalled correctly) across path of insured                 |
      | Accident      | Collision At 'X' Roads              | Governed by traffic lights - Insured crossed on amber                                         |
      | Accident      | Collision At 'X' Roads              | Governed by traffic lights - Insured crossed on green                                         |
      | Accident      | Collision At 'X' Roads              | Governed by traffic lights - Insured crossed on red                                           |
      | Accident      | Caused By Debris On The Road        | Third party vehicle damaged by Debris from insured vehicle                                    |
      | Accident      | Caused By Debris On The Road        | Debris from known third party                                                                 |
      | Accident      | Hit in Rear By Third Party          | Whilst waiting to enter main road at 'T' junction                                             |
      | Accident      | Hit in Rear By Third Party          | Hit in rear and pushed into passing vehicle                                                   |
      | Accident      | Hit in Rear By Third Party          | Hit in rear and pushed into vehicle in front                                                  |
      | Accident      | Hit in Rear By Third Party          | Hit In Rear while correctly proceeding along the road                                         |
      | Accident      | Hit in Rear By Third Party          | Whilst slowing down for an animal crossing the road                                           |
      | Accident      | Hit in Rear By Third Party          | Whilst slowing down for people crossing the road                                              |
      | Accident      | Hit in Rear By Third Party          | Whilst stationary at 'X' roads                                                                |
      | Accident      | Hit Rear Of Third Party             | Hit rear of vehicle stationary at 'X' roads                                                   |
      | Accident      | Hit Rear Of Third Party             | Hit rear of vehicle while correctly proceeding along the road                                 |
      | Accident      | Hit Rear Of Third Party             | Hit rear of vehicle whilst in line of slow moving traffic                                     |
      | Accident      | Hit Rear Of Third Party             | Hit rear of vehicle stationary in line of traffic                                             |
      | Accident      | Hit Rear Of Third Party             | Hit rear of vehicle and pushed into passing vehicle                                           |
      | Accident      | Hit Rear Of Third Party             | Hit rear of vehicle turning off main road                                                     |
      | Accident      | Hit Rear Of Third Party             | Hit rear of vehicle negotiating roundabout                                                    |
      | Accident      | Hit Rear Of Third Party             | Hit rear of vehicle slowing down for an animal crossing the road                              |
      | Accident      | Hit Rear Of Third Party             | Hit rear of vehicle whilst slowing down for people crossing the road                          |
      | Accident      | Hit Rear Of Third Party             | Hit rear of vehicle waiting to enter main road at 'T' junction                                |
      | Accident      | Hit Rear Of Third Party             | Hit rear of vehicle waiting to enter roundabout                                               |
      | Accident      | Moving From Stationary Position     | Insured into path of third party who gave a misleading signal                                 |
      | Accident      | Moving From Stationary Position     | Insured out of lay-by into path of third party who gave a misleading signal                   |
      | Accident      | Moving From Stationary Position     | Insured attempting 'U' turn, collision with third party                                       |
      | Accident      | Moving From Stationary Position     | Insured into path of third party                                                              |
      | Accident      | Moving From Stationary Position     | Insured out of lay-by into path of third party                                                |
      | Accident      | Moving From Stationary Position     | Third party into path of Insured who gave a misleading signal                                 |
      | Accident      | Moving From Stationary Position     | Third party into path of insured                                                              |
      | Accident      | Moving From Stationary Position     | Third Party out of lay-by into path of insured                                                |
      | Accident      | Moving From Stationary Position     | Third party out of lay-by into path of insured who gave a misleading signal                   |
      | Accident      | Moving From Stationary Position     | Third party attempted 'U' turn, collision with insured                                        |
      | Accident      | Multiple Vehicle - Shunt            | Third party from side road - multiple collision on main                                       |
      | Accident      | Multiple Vehicle - Shunt            | Motorway multiple vehicles                                                                    |
      | Accident      | Multiple Vehicle - Shunt            | Insured hit rear of TP forcing it into rear of another                                        |
      | Accident      | Multiple Vehicle - Shunt            | Insured struck rear of TP before being hit from behind                                        |
      | Accident      | Multiple Vehicle - Shunt            | Insured shunted from rear into TP in front                                                    |
      | Accident      | Multiple Vehicle - Shunt            | Insured from side road - multiple collision on main                                           |
      | Accident      | Narrow Road Collision               | Third party rounding bend                                                                     |
      | Accident      | Narrow Road Collision               | Third party passing parked cars                                                               |
      | Accident      | Collision Between Oncoming Vehicles | Three lane carriage way - no priorities                                                       |
      | Accident      | Collision Between Oncoming Vehicles | Three lane carriage way - priority with insured                                               |
      | Accident      | Collision Between Oncoming Vehicles | Three lane carriage way - priority with third party                                           |
      | Accident      | Collision Between Oncoming Vehicles | Insured entered 'one way' street the wrong way and collided with oncoming third party vehicle |
      | Accident      | Collision Between Oncoming Vehicles | Insured turned right across path of oncoming third party vehicle                              |
      | Accident      | Collision Between Oncoming Vehicles | Insured lost control and collided with oncoming third party vehicle                           |
      | Accident      | Collision Between Oncoming Vehicles | In narrow lane - neither party had right of way                                               |
      | Accident      | Collision Between Oncoming Vehicles | On bend in narrow lane - neither party had right of way                                       |
      | Accident      | Collision Between Oncoming Vehicles | Oncoming third party vehicle lost control and collided with insured                           |
      | Accident      | Collision Between Oncoming Vehicles | Insured vehicle overtaking on wrong side of road collided with oncoming third party vehicle   |
      | Accident      | Collision Between Oncoming Vehicles | Collided with oncoming vehicle in a road reduced in width by parked cars on both sides        |
      | Accident      | Collision Between Oncoming Vehicles | Passing parked vehicle(s) in collision with oncoming third party                              |
      | Accident      | Collision Between Oncoming Vehicles | Collided with an oncoming third party who was passing parked vehicle(s)                       |
      | Accident      | Collision Between Oncoming Vehicles | Having swerved to avoid a pedestrian                                                          |
      | Accident      | Collision Between Oncoming Vehicles | Oncoming third party vehicle entered 'one way' street the wrong way and collided with Insured |
      | Accident      | Collision Between Oncoming Vehicles | Oncoming third party vehicle overtaking on wrong side of road collided with insured           |
      | Accident      | Collision Between Oncoming Vehicles | Oncoming third party vehicle turned right across path of insured                              |

@Ignore @passed
  Scenario: CBPCL-200  TC12-PART2 Fail step3 Validation when IncidentType/Cause/Subcause requires a TP VEHICLE incident and none is present
    And I complete step2 for FNOL
    And I select the insureds vehicle at step3
    And I will be on vehicle screen for FNOL
    And I select "AddDriver" on vehicle screen
     And I select the insured as driver of PH vehicle
    And I click ok button on driver screen
    And I click ok button on vehicle screen
    When I select the loss cause types and try to proceed past step3 I will see the validation error message "Add third party vehicle"
      | incident type | cause                                                | sub cause                                                                                                        |
      | Accident      | Car Door Open                                        | Third party opened car door into path of insured                                                                 |
      | Accident      | Car Door Open                                        | Insured opened car door into path of passing third party                                                         |
      | Accident      | Car Door Open                                        | Insured door already open when hit by third party                                                                |
      | Accident      | Overtaking                                           | Insured from behind hit off side of third party vehicle                                                          |
      | Accident      | Overtaking                                           | Insured hit oncoming third party                                                                                 |
      | Accident      | Overtaking                                           | Third Party from behind hit off side of vehicle                                                                  |
      | Accident      | Overtaking                                           | Third Party hit oncoming Insured                                                                                 |
      | Accident      | Collision Whilst Reversing                           | Both parties reversing                                                                                           |
      | Accident      | Collision Whilst Reversing                           | Collided with moving third party vehicle                                                                         |
      | Accident      | Collision Whilst Reversing                           | Collided with parked third party vehicle                                                                         |
      | Accident      | Collision Whilst Reversing                           | Insured reversed into third party vehicle                                                                        |
      | Accident      | Collision Whilst Reversing                           | Third party reversed into insured vehicle                                                                        |
      | Accident      | Collision Whilst Reversing                           | Third party was reversing and colliding with our correctly proceeding vehicle                                    |
      | Accident      | Collision At Roundabout                              | Entering roundabout collided with third party vehicle from right                                                 |
      | Accident      | Collision At Roundabout                              | Hit in rear by third party vehicle whilst waiting to enter roundabout                                            |
      | Accident      | Collision At Roundabout                              | Hit in rear by third party vehicle whilst negotiating roundabout                                                 |
      | Accident      | Collision At Roundabout                              | Collided with nearside of third party vehicle whilst negotiating a roundabout                                    |
      | Accident      | Collision At Roundabout                              | Collided with offside of third party vehicle when attempting to leave roundabout                                 |
      | Accident      | Collision At Roundabout                              | Hit rear of third party vehicle whilst negotiating roundabout                                                    |
      | Accident      | Collision At Roundabout                              | Hit rear of third party vehicle who was waiting to enter roundabout                                              |
      | Accident      | Collision At Roundabout                              | Negotiating roundabout - when third party vehicle entered from left                                              |
      | Accident      | Collision At Roundabout                              | Third party vehicle changed lanes without warning                                                                |
      | Snow          | Snow damage                                          | Someone Else Loss of Control                                                                                     |
      | Accident      | Collision At 'T' Junction                            | Insured emerged from minor road into path of third party TP gave misleading signal.                              |
      | Accident      | Collision At 'T' Junction                            | Insured emerged from minor road into path of third party                                                         |
      | Accident      | Collision At 'T' Junction                            | Third party vehicle emerged from minor road into path of insured who was overtaking a line of stationary traffic |
      | Accident      | Collision At 'T' Junction                            | Insured turned left as third party vehicle attempted to pass on nearside                                         |
      | Accident      | Collision At 'T' Junction                            | Insured turned right across path of oncoming third party vehicle                                                 |
      | Accident      | Collision At 'T' Junction                            | Insured turned right as third party vehicle attempted to pass on offside                                         |
      | Accident      | Collision At 'T' Junction                            | Third party vehicle emerged from minor road into path of insured                                                 |
      | Accident      | Collision At 'T' Junction                            | Insured turning right out of minor road - into path of TP overtaking a line of stationary traffic                |
      | Accident      | Collision At 'T' Junction                            | Third party turned right as insured attempted to pass on offside                                                 |
      | Accident      | Collision At 'T' Junction                            | Third party turned left as insured attempted to pass on nearside                                                 |
      | Accident      | Collision At 'T' Junction                            | Oncoming third party vehicle turned right across path of insured                                                 |
      | Accident      | Collision Whilst Reversing                           | Both parties reversing                                                                                           |
      | Accident      | Collided With Parked Third Party Vehicle at Roadside | Having had attention distracted                                                                                  |
      | Accident      | Collided With Parked Third Party Vehicle at Roadside | Having lost concentration due to fatigue                                                                         |
      | Accident      | Collided With Parked Third Party Vehicle at Roadside | Basic error of judgement                                                                                         |
      | Accident      | Collided With Parked Third Party Vehicle at Roadside | Lost control due to mechanical failure                                                                           |
      | Accident      | Collided With Parked Third Party Vehicle at Roadside | Lost control due to black ice - adverse weather conditions                                                       |
      | Accident      | Collided With Parked Third Party Vehicle at Roadside | Having swerved to avoid an animal which ran across the road                                                      |
      | Accident      | Collided With Parked Third Party Vehicle at Roadside | Having swerved to avoid a pedestrian crossing the road                                                           |
      | Accident      | Collision In Car Park                                | Insured reversed into third party vehicle                                                                        |
      | Accident      | Collision In Car Park                                | Third party reversed into insured vehicle in a car park                                                          |
      | Fire          | Vehicle Damaged By Fire                              | Parked next to or close by a vehicle on fire                                                                     |
| Accident | Hit in Rear By Third Party | Whilst waiting to enter roundabout |
| Accident | Hit in Rear By Third Party | Whilst stationary in line of traffic |
| Accident | Hit in Rear By Third Party | Whilst negotiating a roundabout |

 @Ignore @passed
  Scenario: CBPCL-200  TC13-PART1 Fail step3 Validation when IncidentType/Cause/Subcause requires a TP DRIVER incident and none is present
    And I complete step2 for FNOL
    And I select the insureds vehicle at step3
    And I will be on vehicle screen for FNOL
    And I select "AddDriver" on vehicle screen
     And I select the insured as driver of PH vehicle
    And I click ok button on driver screen
    And I click ok button on vehicle screen
    And I click add Vehicle on step3
    And I input "ND57HFL" into the "VRN" box on vehicle screen
    And I click ok button on vehicle screen
    When I select the loss cause types and try to proceed past step3 I will see the validation error message "Add third party driver"
      | incident type | cause                               | sub cause                                                                                     |
      | Accident      | Changing Lanes                      | Insured failed to notice third party vehicle                                                  |
      | Accident      | Changing Lanes                      | Swerved to avoid a vehicle which did not stop and collided with a third party                 |
      | Accident      | Changing Lanes                      | Swerved to avoid a vehicle which braked suddenly and collided with third party                |
      | Accident      | Changing Lanes                      | Third party failed to notice Insured                                                          |
      | Accident      | Changing Lanes                      | Third party swerved into my path.                                                             |
      | Accident      | Collision At 'X' Roads              | Governed by 'give way' signs - Insured on major road                                          |
      | Accident      | Collision At 'X' Roads              | Governed by 'give way' signs - Insured on minor road                                          |
      | Accident      | Collision At 'X' Roads              | Insured turned right across path of oncoming third party vehicle - no filter light            |
      | Accident      | Collision At 'X' Roads              | Insured turning left hit by third party                                                       |
      | Accident      | Collision At 'X' Roads              | Insured turning right across path of third party                                              |
      | Accident      | Collision At 'X' Roads              | Neither party had right of way                                                                |
      | Accident      | Collision At 'X' Roads              | Governed by 'stop' signs - Insured on major road                                              |
      | Accident      | Collision At 'X' Roads              | Governed by 'stop' signs - Insured on minor road                                              |
      | Accident      | Collision At 'X' Roads              | Oncoming third party vehicle turned right across path of insured - no filter light            |
      | Accident      | Collision At 'X' Roads              | Third party turning left (no signal) hit by Insured                                           |
      | Accident      | Collision At 'X' Roads              | Third party turning left (having signalled correctly) hit by Insured                          |
      | Accident      | Collision At 'X' Roads              | Third party turning right (no signal) across path of Insured                                  |
      | Accident      | Collision At 'X' Roads              | Third party turning right (having signalled correctly) across path of insured                 |
      | Accident      | Collision At 'X' Roads              | Governed by traffic lights - Insured crossed on amber                                         |
      | Accident      | Collision At 'X' Roads              | Governed by traffic lights - Insured crossed on green                                         |
      | Accident      | Collision At 'X' Roads              | Governed by traffic lights - Insured crossed on red                                           |
      | Accident      | Accident Involving Cyclist          | Struck Cyclist crossing                                                                       |
      | Accident      | Accident Involving Cyclist          | Lost control due to mechanical failure                                                        |
      | Accident      | Accident Involving Cyclist          | Struck Cyclist turning left                                                                   |
      | Accident      | Accident Involving Cyclist          | Struck Cyclist turning right                                                                  |
      | Accident      | Accident Involving Cyclist          | Struck Cyclist whilst passing                                                                 |
      | Accident      | Caused By Debris On The Road        | Debris from known third party                                                                 |
      | Accident      | Hit in Rear By Third Party          | Whilst waiting to enter main road at 'T' junction                                             |
      | Accident      | Hit in Rear By Third Party          | Hit in rear and pushed into passing vehicle                                                   |
      | Accident      | Hit in Rear By Third Party          | Hit in rear and pushed into vehicle in front                                                  |
      | Accident      | Hit in Rear By Third Party          | Hit In Rear while correctly proceeding along the road                                         |
      | Accident      | Hit in Rear By Third Party          | Whilst slowing down for an animal crossing the road                                           |
      | Accident      | Hit in Rear By Third Party          | Whilst slowing down for people crossing the road                                              |
      | Accident      | Hit in Rear By Third Party          | Whilst stationary at 'X' roads                                                                |
      | Accident      | Hit Rear Of Third Party             | Hit rear of vehicle stationary at 'X' roads                                                   |
      | Accident      | Hit Rear Of Third Party             | Hit rear of vehicle while correctly proceeding along the road                                 |
      | Accident      | Hit Rear Of Third Party             | Hit rear of vehicle whilst in line of slow moving traffic                                     |
      | Accident      | Hit Rear Of Third Party             | Hit rear of vehicle stationary in line of traffic                                             |
      | Accident      | Hit Rear Of Third Party             | Hit rear of vehicle and pushed into passing vehicle                                           |
      | Accident      | Hit Rear Of Third Party             | Hit rear of vehicle turning off main road                                                     |
      | Accident      | Hit Rear Of Third Party             | Hit rear of vehicle negotiating roundabout                                                    |
      | Accident      | Hit Rear Of Third Party             | Hit rear of vehicle slowing down for an animal crossing the road                              |
      | Accident      | Hit Rear Of Third Party             | Hit rear of vehicle whilst slowing down for people crossing the road                          |
      | Accident      | Hit Rear Of Third Party             | Hit rear of vehicle waiting to enter main road at 'T' junction                                |
      | Accident      | Hit Rear Of Third Party             | Hit rear of vehicle waiting to enter roundabout                                               |
      | Accident      | Moving From Stationary Position     | Insured into path of third party who gave a misleading signal                                 |
      | Accident      | Moving From Stationary Position     | Insured out of lay-by into path of third party who gave a misleading signal                   |
      | Accident      | Moving From Stationary Position     | Insured attempting 'U' turn, collision with third party                                       |
      | Accident      | Moving From Stationary Position     | Insured into path of third party                                                              |
      | Accident      | Moving From Stationary Position     | Insured out of lay-by into path of third party                                                |
      | Accident      | Moving From Stationary Position     | Third party into path of Insured who gave a misleading signal                                 |
      | Accident      | Moving From Stationary Position     | Third party into path of insured                                                              |
      | Accident      | Moving From Stationary Position     | Third Party out of lay-by into path of insured                                                |
      | Accident      | Moving From Stationary Position     | Third party out of lay-by into path of insured who gave a misleading signal                   |
      | Accident      | Moving From Stationary Position     | Third party attempted 'U' turn, collision with insured                                        |
      | Accident      | Multiple Vehicle - Shunt            | Third party from side road - multiple collision on main                                       |
      | Accident      | Multiple Vehicle - Shunt            | Motorway multiple vehicles                                                                    |
      | Accident      | Multiple Vehicle - Shunt            | Insured hit rear of TP forcing it into rear of another                                        |
      | Accident      | Multiple Vehicle - Shunt            | Insured struck rear of TP before being hit from behind                                        |
      | Accident      | Multiple Vehicle - Shunt            | Insured shunted from rear into TP in front                                                    |
      | Accident      | Multiple Vehicle - Shunt            | Insured from side road - multiple collision on main                                           |
      | Accident      | Collision Between Oncoming Vehicles | Three lane carriage way - no priorities                                                       |
      | Accident      | Collision Between Oncoming Vehicles | Three lane carriage way - priority with insured                                               |
      | Accident      | Collision Between Oncoming Vehicles | Three lane carriage way - priority with third party                                           |
      | Accident      | Collision Between Oncoming Vehicles | Insured entered 'one way' street the wrong way and collided with oncoming third party vehicle |
      | Accident      | Collision Between Oncoming Vehicles | Insured turned right across path of oncoming third party vehicle                              |
      | Accident      | Collision Between Oncoming Vehicles | Insured lost control and collided with oncoming third party vehicle                           |
      | Accident      | Collision Between Oncoming Vehicles | In narrow lane - neither party had right of way                                               |
      | Accident      | Collision Between Oncoming Vehicles | On bend in narrow lane - neither party had right of way                                       |
      | Accident      | Collision Between Oncoming Vehicles | Oncoming third party vehicle lost control and collided with insured                           |
      | Accident      | Collision Between Oncoming Vehicles | Insured vehicle overtaking on wrong side of road collided with oncoming third party vehicle   |
      | Accident      | Collision Between Oncoming Vehicles | Collided with oncoming vehicle in a road reduced in width by parked cars on both sides        |
      | Accident      | Collision Between Oncoming Vehicles | Passing parked vehicle(s) in collision with oncoming third party                              |
      | Accident      | Collision Between Oncoming Vehicles | Collided with an oncoming third party who was passing parked vehicle(s)                       |
      | Accident      | Collision Between Oncoming Vehicles | Having swerved to avoid a pedestrian                                                          |
      | Accident      | Collision Between Oncoming Vehicles | Oncoming third party vehicle entered 'one way' street the wrong way and collided with Insured |
      | Accident      | Collision Between Oncoming Vehicles | Oncoming third party vehicle overtaking on wrong side of road collided with insured           |
      | Accident      | Collision Between Oncoming Vehicles | Oncoming third party vehicle turned right across path of insured                              |
      | Accident      | Overtaking                          | Insured from behind hit off side of third party vehicle                                       |
      | Accident      | Overtaking                          | Insured hit oncoming third party                                                              |
      | Accident      | Overtaking                          | Third Party from behind hit off side of vehicle                                               |
      | Accident      | Overtaking                          | Third Party hit oncoming Insured                                                              |

@Ignore @passed
  Scenario: CBPCL-200  TC13-PART2 Fail step3 Validation when IncidentType/Cause/Subcause requires a TP DRIVER incident and none is present
    And I complete step2 for FNOL
    And I select the insureds vehicle at step3
    And I will be on vehicle screen for FNOL
    And I select "AddDriver" on vehicle screen
     And I select the insured as driver of PH vehicle
    And I click ok button on driver screen
    And I click ok button on vehicle screen
    And I click add Vehicle on step3
    And I input "ND57HFL" into the "VRN" box on vehicle screen
    And I click ok button on vehicle screen
    When I select the loss cause types and try to proceed past step3 I will see the validation error message "Add third party driver"
      | incident type | cause                                                | sub cause                                                                                                        |
      | Accident      | Collision Whilst Reversing                           | Both parties reversing                                                                                           |
      | Accident      | Collision Whilst Reversing                           | Collided with moving third party vehicle                                                                         |
      | Accident      | Collision Whilst Reversing                           | Collided with parked third party vehicle                                                                         |
      | Accident      | Collision Whilst Reversing                           | Insured reversed into third party vehicle                                                                        |
      | Accident      | Collision Whilst Reversing                           | Third party was reversing and colliding with our correctly proceeding vehicle                                    |
      | Accident      | Collision At Roundabout                              | Entering roundabout collided with third party vehicle from right                                                 |
      | Accident      | Collision At Roundabout                              | Hit in rear by third party vehicle whilst waiting to enter roundabout                                            |
      | Accident      | Collision At Roundabout                              | Hit in rear by third party vehicle whilst negotiating roundabout                                                 |
      | Accident      | Collision At Roundabout                              | Collided with nearside of third party vehicle whilst negotiating a roundabout                                    |
      | Accident      | Collision At Roundabout                              | Collided with offside of third party vehicle when attempting to leave roundabout                                 |
      | Accident      | Collision At Roundabout                              | Hit rear of third party vehicle whilst negotiating roundabout                                                    |
      | Accident      | Collision At Roundabout                              | Hit rear of third party vehicle who was waiting to enter roundabout                                              |
      | Accident      | Collision At Roundabout                              | Negotiating roundabout - when third party vehicle entered from left                                              |
      | Accident      | Collision At Roundabout                              | Third party vehicle changed lanes without warning                                                                |
      | Accident      | Joining/Leaving Slip Roads/Motorways                 | Insured failed to notice third party vehicle on main road                                                        |
      | Accident      | Joining/Leaving Slip Roads/Motorways                 | Insured failed to give way to traffic on main road                                                               |
      | Accident      | Joining/Leaving Slip Roads/Motorways                 | Insured took wrong exit - collision with third party                                                             |
      | Accident      | Joining/Leaving Slip Roads/Motorways                 | Third party failed to give way to traffic on main road                                                           |
      | Accident      | Joining/Leaving Slip Roads/Motorways                 | Third party failed to notice insured vehicle on main road                                                        |
      | Accident      | Joining/Leaving Slip Roads/Motorways                 | Insured collided with third party who had taken wrong exit                                                       |
      | Snow          | Snow damage                                          | Someone Else Loss of Control                                                                                     |
      | Accident      | Collision At 'T' Junction                            | Insured emerged from minor road into path of third party TP gave misleading signal.                              |
      | Accident      | Collision At 'T' Junction                            | Insured emerged from minor road into path of third party                                                         |
      | Accident      | Collision At 'T' Junction                            | Third party vehicle emerged from minor road into path of insured who was overtaking a line of stationary traffic |
      | Accident      | Collision At 'T' Junction                            | Insured turned left as third party vehicle attempted to pass on nearside                                         |
      | Accident      | Collision At 'T' Junction                            | Insured turned right across path of oncoming third party vehicle                                                 |
      | Accident      | Collision At 'T' Junction                            | Insured turned right as third party vehicle attempted to pass on offside                                         |
      | Accident      | Collision At 'T' Junction                            | Third party vehicle emerged from minor road into path of insured                                                 |
      | Accident      | Collision At 'T' Junction                            | Insured turning right out of minor road - into path of TP overtaking a line of stationary traffic                |
      | Accident      | Collision At 'T' Junction                            | Third party turned right as insured attempted to pass on offside                                                 |
      | Accident      | Collision At 'T' Junction                            | Third party turned left as insured attempted to pass on nearside                                                 |
      | Accident      | Collision At 'T' Junction                            | Oncoming third party vehicle turned right across path of insured                                                 |
      | Accident      | Collision Whilst Reversing                           | Both parties reversing                                                                                           |
      | Accident      | Collided With Parked Third Party Vehicle at Roadside | Having had attention distracted                                                                                  |
      | Accident      | Collided With Parked Third Party Vehicle at Roadside | Having lost concentration due to fatigue                                                                         |
      | Accident      | Collided With Parked Third Party Vehicle at Roadside | Basic error of judgement                                                                                         |
      | Accident      | Collided With Parked Third Party Vehicle at Roadside | Lost control due to mechanical failure                                                                           |
      | Accident      | Collided With Parked Third Party Vehicle at Roadside | Lost control due to black ice - adverse weather conditions                                                       |
      | Accident      | Collided With Parked Third Party Vehicle at Roadside | Having swerved to avoid an animal which ran across the road                                                      |
      | Accident      | Collided With Parked Third Party Vehicle at Roadside | Having swerved to avoid a pedestrian crossing the road                                                           |
      | Accident      | Collision In Car Park                                | Insured reversed into third party vehicle                                                                        |
      | Accident      | Collision In Car Park                                | Third party reversed into insured vehicle in a car park                                                          |

@Ignore @passed
 Scenario: CBPCL-200  TC13-PART3 Fail step3 Validation when IncidentType/Cause/Subcause requires a TP DRIVER incident and none is present
    And I complete step2 for FNOL
    And I select the insureds vehicle at step3
    And I will be on vehicle screen for FNOL
    And I select "AddDriver" on vehicle screen
     And I select the insured as driver of PH vehicle
    And I click ok button on driver screen
    And I click ok button on vehicle screen
    And I click add Vehicle on step3
    And I input "ND57HFL" into the "VRN" box on vehicle screen
    And I click ok button on vehicle screen
    When I select the loss cause types and try to proceed past step3 I will see the validation error message "Add third party driver"
      | incident type | cause                                                | sub cause                                                                                                        |
| Accident | Narrow Road Collision | Third party rounding bend |
| Accident | Narrow Road Collision | Third party passing parked cars |
| Accident | Car Door Open | Insured opened car door into path of passing third party |

@Ignore @passed
Scenario: CBPCL-200/408 TC13-PART4 Fail step3 Validation when IncidentType/Cause/Subcause requires a TP DRIVER incident and none is present
And I complete step2 for FNOL
And I select the insureds vehicle at step3
And I will be on vehicle screen for FNOL
And I select "AddDriver" on vehicle screen
And I select "Paul Milligan" from "Driver Name" on driver screen
And I click ok button on driver screen
And I click ok button on vehicle screen
And I click add Vehicle on step3
And I input "ND57HFL" into the "VRN" box on vehicle screen
And I click ok button on vehicle screen
When I select the loss cause types and try to proceed past step3 I will see the validation error message "Add third party driver"
| incident type | cause | sub cause |
| Accident | Hit in Rear By Third Party | Whilst waiting to enter roundabout |
| Accident | Hit in Rear By Third Party | Whilst stationary in line of traffic |
| Accident | Hit in Rear By Third Party | Whilst negotiating a roundabout |

 @Ignore @passed
  Scenario: CBPCL-200 TC14 Fail step3 Validation when IncidentType/Cause/Subcause requires a TP PROPERTY incident and none is present
    And I complete step2 for FNOL
    And I select the insureds vehicle at step3
    And I will be on vehicle screen for FNOL
    And I select "AddDriver" on vehicle screen
     And I select the insured as driver of PH vehicle
    And I click ok button on driver screen
    And I click ok button on vehicle screen
    When I select the loss cause types and try to proceed past step3 I will see the validation error message "Add property incident"
      | incident type | cause                      | sub cause                                                   |
      | Accident      | Collided With Fixed Object | Having swerved to avoid an animal which ran across the road |
      | Accident      | Collided With Fixed Object | Having swerved to avoid a pedestrian crossing the road      |
      | Accident      | Collided With Fixed Object | Having had attention distracted                             |
      | Accident      | Collided With Fixed Object | Basic error of judgement                                    |
      | Accident      | Collided With Fixed Object | Having lost concentration due to fatigue                    |
      | Accident      | Collided With Fixed Object | Lost control due to mechanical failure                      |
      | Accident      | Collided With Fixed Object | Lost control due to black ice - adverse weather conditions  |
      | Accident      | Collision Whilst Reversing | Collided with bollard                                       |
      | Accident      | Collision Whilst Reversing | Other innate object                                         |
      | Accident      | Collision Whilst Reversing          | Collided with post/pillar/wall                                                                                   |
    
 @Ignore @passed
  Scenario: CBPCL-200  TC15 Fail step3 Validation when IncidentType/Cause/Subcause requires a PEDESTRIAN incident and none is present
    And I complete step2 for FNOL
    And I select the insureds vehicle at step3
    And I will be on vehicle screen for FNOL
    And I select "AddDriver" on vehicle screen
     And I select the insured as driver of PH vehicle
    And I click ok button on driver screen
    And I click ok button on vehicle screen
    When I select the loss cause types and try to proceed past step3 I will see the validation error message "Add pedestrian"
      | incident type | cause                         | sub cause                                                             |
      | Accident      | Accident Involving Pedestrian | Struck pedestrian crossing from nearside from between parked vehicles |
      | Accident      | Accident Involving Pedestrian | Struck pedestrian on pedestrian crossing                              |
      | Accident      | Accident Involving Pedestrian | Struck pedestrian crossing road                                       |
      | Accident      | Accident Involving Pedestrian | Struck pedestrian/child whilst reversing                              |
      | Accident      | Accident Involving Pedestrian | Struck pedestrian on pelican crossing - lights in our favour          |
      | Accident      | Accident Involving Pedestrian | Struck pedestrian on pelican crossing - lights not in our favour      |
      | Accident      | Collision Whilst Reversing    | Struck pedestrian/child                                               |

  @Ignore @blocked_no_property_owner
  Scenario: CBPCL-200  TC16 Fail step3 Validation when IncidentType/Cause/Subcause requires a TP PROPERTY OWNER incident wandnone is present
    And I complete step2 for FNOL
    When I select the loss cause types and try to proceed past step3 I will see the validation error message "add property owner"
      | incident type | cause                   | sub cause                                     |
      | Fire          | Vehicle Damaged By Fire | Parked next to or close by a property on fire |

  @Ignore @failedtest
  Scenario: CBPCL-200 TC17 Fail step3 Validation when IncidentType/Cause/Subcause requires a TP VEHICLE OWNER incident and none is present
    And I complete step2 for FNOL
    And I click add Vehicle on step3
    And I input "ND57HFL" into the "VRN" box on vehicle screen
    And I click ok button on vehicle screen
    When I select the loss cause types and try to proceed past step3 I will see the validation error message "Add third party owner"
      | incident type | cause                   | sub cause                                    |
      | Fire          | Vehicle Damaged By Fire | Parked next to or close by a vehicle on fire |
