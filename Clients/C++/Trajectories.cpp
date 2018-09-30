#pragma once

#include <map>
#include <set>
#include <string>
#include <tuple>
#include <vector>

#include <krpc/decoder.hpp>
#include <krpc/encoder.hpp>
#include <krpc/error.hpp>
#include <krpc/event.hpp>
#include <krpc/object.hpp>
#include <krpc/service.hpp>
#include <krpc/stream.hpp>

namespace krpc {
namespace services {

class Trajectories : public Service {
 public:
  explicit Trajectories(Client* client);

  /**
   * Returns the corrected direction or Null if no active vessel or set target.
   */
  std::tuple<float, float, float> corrected_direction();

  /**
   * Returns trajectory patch EndTime or Null if no active vessel or calculated trajectory.
   * See GetTimeTillImpact for remaining time until impact.
   */
  double get_end_time();

  /**
   * Returns the calculated impact position of the trajectory in lat and long.
   */
  std::tuple<double, double> get_impact_lat_long();

  /**
   * Returns the calculated impact position of the trajectory or Null if no active vessel or calculated trajectory.
   */
  std::tuple<float, float, float> get_impact_position();

  /**
   * Returns the calculated impact velocity of the trajectory or Null if no active vessel or calculated trajectory.
   */
  std::tuple<float, float, float> get_impact_velocity();

  /**
   * Returns the remaining time until Impact in seconds or Null if no active vessel or calculated trajectory.
   */
  double get_time_till_impact();

  /**
   * Returns true if a target has been set, false if not, or Null if no active vessel.
   */
  bool has_target();

  /**
   * Returns the planned direction or Null if no active vessel or set target.
   */
  std::tuple<float, float, float> planned_direction();

  /**
   * Set the trajectories target to a latitude, longitude and altitude at the HomeWorld.
   */
  void set_target(double lat, double lon, double alt);

  /**
   * Modifies the AlwaysUpdate value in the settings page.
   */
  bool always_update();

  /**
   * Modifies the AlwaysUpdate value in the settings page.
   */
  void set_always_update(bool value);

  /**
   * Returns the version number of trajectories in a string formated as Major.Minor.Patch i.e. 2.1.0
   */
  std::string get_version();

  /**
   * Returns the major version number of trajectories
   */
  int32_t get_version_major();

  /**
   * Returns the minor version number of trajectories
   */
  int32_t get_version_minor();

  /**
   * Returns the patch version number of trajectories
   */
  int32_t get_version_patch();

  /**
   * Set the trajectories descent profile to Prograde.
   */
  bool prograde_entry();

  /**
   * Set the trajectories descent profile to Prograde.
   */
  void set_prograde_entry(bool value);

  /**
   * Set the trajectories descent profile to Prograde.
   */
  bool retrograde_entry();

  /**
   * Set the trajectories descent profile to Prograde.
   */
  void set_retrograde_entry(bool value);

  ::krpc::Stream<std::tuple<float, float, float>> corrected_direction_stream();

  ::krpc::Stream<double> get_end_time_stream();

  ::krpc::Stream<std::tuple<double, double>> get_impact_lat_long_stream();

  ::krpc::Stream<std::tuple<float, float, float>> get_impact_position_stream();

  ::krpc::Stream<std::tuple<float, float, float>> get_impact_velocity_stream();

  ::krpc::Stream<double> get_time_till_impact_stream();

  ::krpc::Stream<bool> has_target_stream();

  ::krpc::Stream<std::tuple<float, float, float>> planned_direction_stream();

  ::krpc::Stream<bool> always_update_stream();

  ::krpc::Stream<std::string> get_version_stream();

  ::krpc::Stream<int32_t> get_version_major_stream();

  ::krpc::Stream<int32_t> get_version_minor_stream();

  ::krpc::Stream<int32_t> get_version_patch_stream();

  ::krpc::Stream<bool> prograde_entry_stream();

  ::krpc::Stream<bool> retrograde_entry_stream();

  ::krpc::schema::ProcedureCall corrected_direction_call();

  ::krpc::schema::ProcedureCall get_end_time_call();

  ::krpc::schema::ProcedureCall get_impact_lat_long_call();

  ::krpc::schema::ProcedureCall get_impact_position_call();

  ::krpc::schema::ProcedureCall get_impact_velocity_call();

  ::krpc::schema::ProcedureCall get_time_till_impact_call();

  ::krpc::schema::ProcedureCall has_target_call();

  ::krpc::schema::ProcedureCall planned_direction_call();

  ::krpc::schema::ProcedureCall set_target_call(double lat, double lon, double alt);

  ::krpc::schema::ProcedureCall always_update_call();

  ::krpc::schema::ProcedureCall set_always_update_call(bool value);

  ::krpc::schema::ProcedureCall get_version_call();

  ::krpc::schema::ProcedureCall get_version_major_call();

  ::krpc::schema::ProcedureCall get_version_minor_call();

  ::krpc::schema::ProcedureCall get_version_patch_call();

  ::krpc::schema::ProcedureCall prograde_entry_call();

  ::krpc::schema::ProcedureCall set_prograde_entry_call(bool value);

  ::krpc::schema::ProcedureCall retrograde_entry_call();

  ::krpc::schema::ProcedureCall set_retrograde_entry_call(bool value);
};

}  // namespace services

namespace services {

inline Trajectories::Trajectories(Client* client):
  Service(client) {
}

inline std::tuple<float, float, float> Trajectories::corrected_direction() {
  std::string _data = this->_client->invoke("Trajectories", "CorrectedDirection");
  std::tuple<float, float, float> _result;
  decoder::decode(_result, _data, this->_client);
  return _result;
}

inline double Trajectories::get_end_time() {
  std::string _data = this->_client->invoke("Trajectories", "GetEndTime");
  double _result;
  decoder::decode(_result, _data, this->_client);
  return _result;
}

inline std::tuple<double, double> Trajectories::get_impact_lat_long() {
  std::string _data = this->_client->invoke("Trajectories", "GetImpactLatLong");
  std::tuple<double, double> _result;
  decoder::decode(_result, _data, this->_client);
  return _result;
}

inline std::tuple<float, float, float> Trajectories::get_impact_position() {
  std::string _data = this->_client->invoke("Trajectories", "GetImpactPosition");
  std::tuple<float, float, float> _result;
  decoder::decode(_result, _data, this->_client);
  return _result;
}

inline std::tuple<float, float, float> Trajectories::get_impact_velocity() {
  std::string _data = this->_client->invoke("Trajectories", "GetImpactVelocity");
  std::tuple<float, float, float> _result;
  decoder::decode(_result, _data, this->_client);
  return _result;
}

inline double Trajectories::get_time_till_impact() {
  std::string _data = this->_client->invoke("Trajectories", "GetTimeTillImpact");
  double _result;
  decoder::decode(_result, _data, this->_client);
  return _result;
}

inline bool Trajectories::has_target() {
  std::string _data = this->_client->invoke("Trajectories", "HasTarget");
  bool _result;
  decoder::decode(_result, _data, this->_client);
  return _result;
}

inline std::tuple<float, float, float> Trajectories::planned_direction() {
  std::string _data = this->_client->invoke("Trajectories", "PlannedDirection");
  std::tuple<float, float, float> _result;
  decoder::decode(_result, _data, this->_client);
  return _result;
}

inline void Trajectories::set_target(double lat, double lon, double alt = 2.0) {
  std::vector<std::string> _args;
  _args.push_back(encoder::encode(lat));
  _args.push_back(encoder::encode(lon));
  _args.push_back(encoder::encode(alt));
  this->_client->invoke("Trajectories", "SetTarget", _args);
}

inline bool Trajectories::always_update() {
  std::string _data = this->_client->invoke("Trajectories", "get_AlwaysUpdate");
  bool _result;
  decoder::decode(_result, _data, this->_client);
  return _result;
}

inline void Trajectories::set_always_update(bool value) {
  std::vector<std::string> _args;
  _args.push_back(encoder::encode(value));
  this->_client->invoke("Trajectories", "set_AlwaysUpdate", _args);
}

inline std::string Trajectories::get_version() {
  std::string _data = this->_client->invoke("Trajectories", "get_GetVersion");
  std::string _result;
  decoder::decode(_result, _data, this->_client);
  return _result;
}

inline int32_t Trajectories::get_version_major() {
  std::string _data = this->_client->invoke("Trajectories", "get_GetVersionMajor");
  int32_t _result;
  decoder::decode(_result, _data, this->_client);
  return _result;
}

inline int32_t Trajectories::get_version_minor() {
  std::string _data = this->_client->invoke("Trajectories", "get_GetVersionMinor");
  int32_t _result;
  decoder::decode(_result, _data, this->_client);
  return _result;
}

inline int32_t Trajectories::get_version_patch() {
  std::string _data = this->_client->invoke("Trajectories", "get_GetVersionPatch");
  int32_t _result;
  decoder::decode(_result, _data, this->_client);
  return _result;
}

inline bool Trajectories::prograde_entry() {
  std::string _data = this->_client->invoke("Trajectories", "get_ProgradeEntry");
  bool _result;
  decoder::decode(_result, _data, this->_client);
  return _result;
}

inline void Trajectories::set_prograde_entry(bool value) {
  std::vector<std::string> _args;
  _args.push_back(encoder::encode(value));
  this->_client->invoke("Trajectories", "set_ProgradeEntry", _args);
}

inline bool Trajectories::retrograde_entry() {
  std::string _data = this->_client->invoke("Trajectories", "get_RetrogradeEntry");
  bool _result;
  decoder::decode(_result, _data, this->_client);
  return _result;
}

inline void Trajectories::set_retrograde_entry(bool value) {
  std::vector<std::string> _args;
  _args.push_back(encoder::encode(value));
  this->_client->invoke("Trajectories", "set_RetrogradeEntry", _args);
}

inline ::krpc::Stream<std::tuple<float, float, float>> Trajectories::corrected_direction_stream() {
  return ::krpc::Stream<std::tuple<float, float, float>>(this->_client, this->_client->build_call("Trajectories", "CorrectedDirection"));
}

inline ::krpc::Stream<double> Trajectories::get_end_time_stream() {
  return ::krpc::Stream<double>(this->_client, this->_client->build_call("Trajectories", "GetEndTime"));
}

inline ::krpc::Stream<std::tuple<double, double>> Trajectories::get_impact_lat_long_stream() {
  return ::krpc::Stream<std::tuple<double, double>>(this->_client, this->_client->build_call("Trajectories", "GetImpactLatLong"));
}

inline ::krpc::Stream<std::tuple<float, float, float>> Trajectories::get_impact_position_stream() {
  return ::krpc::Stream<std::tuple<float, float, float>>(this->_client, this->_client->build_call("Trajectories", "GetImpactPosition"));
}

inline ::krpc::Stream<std::tuple<float, float, float>> Trajectories::get_impact_velocity_stream() {
  return ::krpc::Stream<std::tuple<float, float, float>>(this->_client, this->_client->build_call("Trajectories", "GetImpactVelocity"));
}

inline ::krpc::Stream<double> Trajectories::get_time_till_impact_stream() {
  return ::krpc::Stream<double>(this->_client, this->_client->build_call("Trajectories", "GetTimeTillImpact"));
}

inline ::krpc::Stream<bool> Trajectories::has_target_stream() {
  return ::krpc::Stream<bool>(this->_client, this->_client->build_call("Trajectories", "HasTarget"));
}

inline ::krpc::Stream<std::tuple<float, float, float>> Trajectories::planned_direction_stream() {
  return ::krpc::Stream<std::tuple<float, float, float>>(this->_client, this->_client->build_call("Trajectories", "PlannedDirection"));
}

inline ::krpc::Stream<bool> Trajectories::always_update_stream() {
  return ::krpc::Stream<bool>(this->_client, this->_client->build_call("Trajectories", "get_AlwaysUpdate"));
}

inline ::krpc::Stream<std::string> Trajectories::get_version_stream() {
  return ::krpc::Stream<std::string>(this->_client, this->_client->build_call("Trajectories", "get_GetVersion"));
}

inline ::krpc::Stream<int32_t> Trajectories::get_version_major_stream() {
  return ::krpc::Stream<int32_t>(this->_client, this->_client->build_call("Trajectories", "get_GetVersionMajor"));
}

inline ::krpc::Stream<int32_t> Trajectories::get_version_minor_stream() {
  return ::krpc::Stream<int32_t>(this->_client, this->_client->build_call("Trajectories", "get_GetVersionMinor"));
}

inline ::krpc::Stream<int32_t> Trajectories::get_version_patch_stream() {
  return ::krpc::Stream<int32_t>(this->_client, this->_client->build_call("Trajectories", "get_GetVersionPatch"));
}

inline ::krpc::Stream<bool> Trajectories::prograde_entry_stream() {
  return ::krpc::Stream<bool>(this->_client, this->_client->build_call("Trajectories", "get_ProgradeEntry"));
}

inline ::krpc::Stream<bool> Trajectories::retrograde_entry_stream() {
  return ::krpc::Stream<bool>(this->_client, this->_client->build_call("Trajectories", "get_RetrogradeEntry"));
}

inline ::krpc::schema::ProcedureCall Trajectories::corrected_direction_call() {
  return this->_client->build_call("Trajectories", "CorrectedDirection");
}

inline ::krpc::schema::ProcedureCall Trajectories::get_end_time_call() {
  return this->_client->build_call("Trajectories", "GetEndTime");
}

inline ::krpc::schema::ProcedureCall Trajectories::get_impact_lat_long_call() {
  return this->_client->build_call("Trajectories", "GetImpactLatLong");
}

inline ::krpc::schema::ProcedureCall Trajectories::get_impact_position_call() {
  return this->_client->build_call("Trajectories", "GetImpactPosition");
}

inline ::krpc::schema::ProcedureCall Trajectories::get_impact_velocity_call() {
  return this->_client->build_call("Trajectories", "GetImpactVelocity");
}

inline ::krpc::schema::ProcedureCall Trajectories::get_time_till_impact_call() {
  return this->_client->build_call("Trajectories", "GetTimeTillImpact");
}

inline ::krpc::schema::ProcedureCall Trajectories::has_target_call() {
  return this->_client->build_call("Trajectories", "HasTarget");
}

inline ::krpc::schema::ProcedureCall Trajectories::planned_direction_call() {
  return this->_client->build_call("Trajectories", "PlannedDirection");
}

inline ::krpc::schema::ProcedureCall Trajectories::set_target_call(double lat, double lon, double alt = 2.0) {
  std::vector<std::string> _args;
  _args.push_back(encoder::encode(lat));
  _args.push_back(encoder::encode(lon));
  _args.push_back(encoder::encode(alt));
  return this->_client->build_call("Trajectories", "SetTarget", _args);
}

inline ::krpc::schema::ProcedureCall Trajectories::always_update_call() {
  return this->_client->build_call("Trajectories", "get_AlwaysUpdate");
}

inline ::krpc::schema::ProcedureCall Trajectories::set_always_update_call(bool value) {
  std::vector<std::string> _args;
  _args.push_back(encoder::encode(value));
  return this->_client->build_call("Trajectories", "set_AlwaysUpdate", _args);
}

inline ::krpc::schema::ProcedureCall Trajectories::get_version_call() {
  return this->_client->build_call("Trajectories", "get_GetVersion");
}

inline ::krpc::schema::ProcedureCall Trajectories::get_version_major_call() {
  return this->_client->build_call("Trajectories", "get_GetVersionMajor");
}

inline ::krpc::schema::ProcedureCall Trajectories::get_version_minor_call() {
  return this->_client->build_call("Trajectories", "get_GetVersionMinor");
}

inline ::krpc::schema::ProcedureCall Trajectories::get_version_patch_call() {
  return this->_client->build_call("Trajectories", "get_GetVersionPatch");
}

inline ::krpc::schema::ProcedureCall Trajectories::prograde_entry_call() {
  return this->_client->build_call("Trajectories", "get_ProgradeEntry");
}

inline ::krpc::schema::ProcedureCall Trajectories::set_prograde_entry_call(bool value) {
  std::vector<std::string> _args;
  _args.push_back(encoder::encode(value));
  return this->_client->build_call("Trajectories", "set_ProgradeEntry", _args);
}

inline ::krpc::schema::ProcedureCall Trajectories::retrograde_entry_call() {
  return this->_client->build_call("Trajectories", "get_RetrogradeEntry");
}

inline ::krpc::schema::ProcedureCall Trajectories::set_retrograde_entry_call(bool value) {
  std::vector<std::string> _args;
  _args.push_back(encoder::encode(value));
  return this->_client->build_call("Trajectories", "set_RetrogradeEntry", _args);
}
}  // namespace services

}