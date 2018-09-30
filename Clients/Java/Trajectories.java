package krpc.client.services;

import com.google.protobuf.ByteString;

import krpc.client.Connection;
import krpc.client.Encoder;
import krpc.client.RemoteEnum;
import krpc.client.RemoteObject;
import krpc.client.RPCInfo;
import krpc.client.RPCException;
import krpc.client.Types;

public class Trajectories {

    public static Trajectories newInstance(Connection connection) {
        return new Trajectories(connection);
    }

    private Connection connection;

    private Trajectories(Connection connection) {
        this.connection = connection;
    }

    private void addExceptionTypes(Connection connection) {
    }

    /**
     * Returns the corrected direction or Null if no active vessel or set target.
     */
    @SuppressWarnings({ "unchecked" })
    @RPCInfo(service = "Trajectories", procedure = "CorrectedDirection", types = _Types.class)
    public org.javatuples.Triplet<Float,Float,Float> correctedDirection() throws RPCException {
        ByteString _data = this.connection.invoke("Trajectories", "CorrectedDirection");
        return (org.javatuples.Triplet<Float,Float,Float>) Encoder.decode(_data, krpc.client.Types.createTuple(krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.FLOAT),krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.FLOAT),krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.FLOAT)), this.connection);
    }

    /**
     * Returns trajectory patch EndTime or Null if no active vessel or calculated trajectory.
     * See GetTimeTillImpact for remaining time until impact.
     */
    @SuppressWarnings({ "unchecked" })
    @RPCInfo(service = "Trajectories", procedure = "GetEndTime", types = _Types.class)
    public double getEndTime() throws RPCException {
        ByteString _data = this.connection.invoke("Trajectories", "GetEndTime");
        return (double) Encoder.decode(_data, krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.DOUBLE), this.connection);
    }

    /**
     * Returns the calculated impact position of the trajectory in lat and long.
     */
    @SuppressWarnings({ "unchecked" })
    @RPCInfo(service = "Trajectories", procedure = "GetImpactLatLong", types = _Types.class)
    public org.javatuples.Pair<Double,Double> getImpactLatLong() throws RPCException {
        ByteString _data = this.connection.invoke("Trajectories", "GetImpactLatLong");
        return (org.javatuples.Pair<Double,Double>) Encoder.decode(_data, krpc.client.Types.createTuple(krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.DOUBLE),krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.DOUBLE)), this.connection);
    }

    /**
     * Returns the calculated impact position of the trajectory or Null if no active vessel or calculated trajectory.
     */
    @SuppressWarnings({ "unchecked" })
    @RPCInfo(service = "Trajectories", procedure = "GetImpactPosition", types = _Types.class)
    public org.javatuples.Triplet<Float,Float,Float> getImpactPosition() throws RPCException {
        ByteString _data = this.connection.invoke("Trajectories", "GetImpactPosition");
        return (org.javatuples.Triplet<Float,Float,Float>) Encoder.decode(_data, krpc.client.Types.createTuple(krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.FLOAT),krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.FLOAT),krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.FLOAT)), this.connection);
    }

    /**
     * Returns the calculated impact velocity of the trajectory or Null if no active vessel or calculated trajectory.
     */
    @SuppressWarnings({ "unchecked" })
    @RPCInfo(service = "Trajectories", procedure = "GetImpactVelocity", types = _Types.class)
    public org.javatuples.Triplet<Float,Float,Float> getImpactVelocity() throws RPCException {
        ByteString _data = this.connection.invoke("Trajectories", "GetImpactVelocity");
        return (org.javatuples.Triplet<Float,Float,Float>) Encoder.decode(_data, krpc.client.Types.createTuple(krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.FLOAT),krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.FLOAT),krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.FLOAT)), this.connection);
    }

    /**
     * Returns the remaining time until Impact in seconds or Null if no active vessel or calculated trajectory.
     */
    @SuppressWarnings({ "unchecked" })
    @RPCInfo(service = "Trajectories", procedure = "GetTimeTillImpact", types = _Types.class)
    public double getTimeTillImpact() throws RPCException {
        ByteString _data = this.connection.invoke("Trajectories", "GetTimeTillImpact");
        return (double) Encoder.decode(_data, krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.DOUBLE), this.connection);
    }

    /**
     * Returns true if a target has been set, false if not, or Null if no active vessel.
     */
    @SuppressWarnings({ "unchecked" })
    @RPCInfo(service = "Trajectories", procedure = "HasTarget", types = _Types.class)
    public boolean hasTarget() throws RPCException {
        ByteString _data = this.connection.invoke("Trajectories", "HasTarget");
        return (boolean) Encoder.decode(_data, krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.BOOL), this.connection);
    }

    /**
     * Returns the planned direction or Null if no active vessel or set target.
     */
    @SuppressWarnings({ "unchecked" })
    @RPCInfo(service = "Trajectories", procedure = "PlannedDirection", types = _Types.class)
    public org.javatuples.Triplet<Float,Float,Float> plannedDirection() throws RPCException {
        ByteString _data = this.connection.invoke("Trajectories", "PlannedDirection");
        return (org.javatuples.Triplet<Float,Float,Float>) Encoder.decode(_data, krpc.client.Types.createTuple(krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.FLOAT),krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.FLOAT),krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.FLOAT)), this.connection);
    }

    /**
     * Set the trajectories target to a latitude, longitude and altitude at the HomeWorld.
     */
    @SuppressWarnings({ "unchecked" })
    @RPCInfo(service = "Trajectories", procedure = "SetTarget", types = _Types.class)
    public void setTarget(double lat, double lon, double alt) throws RPCException {
        ByteString[] _args = new ByteString[] {
            Encoder.encode(lat, krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.DOUBLE)),
            Encoder.encode(lon, krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.DOUBLE)),
            Encoder.encode(alt, krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.DOUBLE))
        };
        this.connection.invoke("Trajectories", "SetTarget", _args);
    }

    /**
     * Modifies the AlwaysUpdate value in the settings page.
     */
    @SuppressWarnings({ "unchecked" })
    @RPCInfo(service = "Trajectories", procedure = "get_AlwaysUpdate", types = _Types.class)
    public boolean getAlwaysUpdate() throws RPCException {
        ByteString _data = this.connection.invoke("Trajectories", "get_AlwaysUpdate");
        return (boolean) Encoder.decode(_data, krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.BOOL), this.connection);
    }

    /**
     * Modifies the AlwaysUpdate value in the settings page.
     */
    @SuppressWarnings({ "unchecked" })
    @RPCInfo(service = "Trajectories", procedure = "set_AlwaysUpdate", types = _Types.class)
    public void setAlwaysUpdate(boolean value) throws RPCException {
        ByteString[] _args = new ByteString[] {
            Encoder.encode(value, krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.BOOL))
        };
        this.connection.invoke("Trajectories", "set_AlwaysUpdate", _args);
    }

    /**
     * Returns the version number of trajectories in a string formated as Major.Minor.Patch i.e. 2.1.0
     */
    @SuppressWarnings({ "unchecked" })
    @RPCInfo(service = "Trajectories", procedure = "get_GetVersion", types = _Types.class)
    public String getGetVersion() throws RPCException {
        ByteString _data = this.connection.invoke("Trajectories", "get_GetVersion");
        return (String) Encoder.decode(_data, krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.STRING), this.connection);
    }

    /**
     * Returns the major version number of trajectories
     */
    @SuppressWarnings({ "unchecked" })
    @RPCInfo(service = "Trajectories", procedure = "get_GetVersionMajor", types = _Types.class)
    public int getGetVersionMajor() throws RPCException {
        ByteString _data = this.connection.invoke("Trajectories", "get_GetVersionMajor");
        return (int) Encoder.decode(_data, krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.SINT32), this.connection);
    }

    /**
     * Returns the minor version number of trajectories
     */
    @SuppressWarnings({ "unchecked" })
    @RPCInfo(service = "Trajectories", procedure = "get_GetVersionMinor", types = _Types.class)
    public int getGetVersionMinor() throws RPCException {
        ByteString _data = this.connection.invoke("Trajectories", "get_GetVersionMinor");
        return (int) Encoder.decode(_data, krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.SINT32), this.connection);
    }

    /**
     * Returns the patch version number of trajectories
     */
    @SuppressWarnings({ "unchecked" })
    @RPCInfo(service = "Trajectories", procedure = "get_GetVersionPatch", types = _Types.class)
    public int getGetVersionPatch() throws RPCException {
        ByteString _data = this.connection.invoke("Trajectories", "get_GetVersionPatch");
        return (int) Encoder.decode(_data, krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.SINT32), this.connection);
    }

    /**
     * Set the trajectories descent profile to Prograde.
     */
    @SuppressWarnings({ "unchecked" })
    @RPCInfo(service = "Trajectories", procedure = "get_ProgradeEntry", types = _Types.class)
    public boolean getProgradeEntry() throws RPCException {
        ByteString _data = this.connection.invoke("Trajectories", "get_ProgradeEntry");
        return (boolean) Encoder.decode(_data, krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.BOOL), this.connection);
    }

    /**
     * Set the trajectories descent profile to Prograde.
     */
    @SuppressWarnings({ "unchecked" })
    @RPCInfo(service = "Trajectories", procedure = "set_ProgradeEntry", types = _Types.class)
    public void setProgradeEntry(boolean value) throws RPCException {
        ByteString[] _args = new ByteString[] {
            Encoder.encode(value, krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.BOOL))
        };
        this.connection.invoke("Trajectories", "set_ProgradeEntry", _args);
    }

    /**
     * Set the trajectories descent profile to Prograde.
     */
    @SuppressWarnings({ "unchecked" })
    @RPCInfo(service = "Trajectories", procedure = "get_RetrogradeEntry", types = _Types.class)
    public boolean getRetrogradeEntry() throws RPCException {
        ByteString _data = this.connection.invoke("Trajectories", "get_RetrogradeEntry");
        return (boolean) Encoder.decode(_data, krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.BOOL), this.connection);
    }

    /**
     * Set the trajectories descent profile to Prograde.
     */
    @SuppressWarnings({ "unchecked" })
    @RPCInfo(service = "Trajectories", procedure = "set_RetrogradeEntry", types = _Types.class)
    public void setRetrogradeEntry(boolean value) throws RPCException {
        ByteString[] _args = new ByteString[] {
            Encoder.encode(value, krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.BOOL))
        };
        this.connection.invoke("Trajectories", "set_RetrogradeEntry", _args);
    }

    public static class _Types {
        public static krpc.schema.KRPC.Type getReturnType(String procedure) {
            switch (procedure) {
            case "CorrectedDirection":
                return krpc.client.Types.createTuple(krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.FLOAT),krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.FLOAT),krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.FLOAT));
            case "GetEndTime":
                return krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.DOUBLE);
            case "GetImpactLatLong":
                return krpc.client.Types.createTuple(krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.DOUBLE),krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.DOUBLE));
            case "GetImpactPosition":
                return krpc.client.Types.createTuple(krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.FLOAT),krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.FLOAT),krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.FLOAT));
            case "GetImpactVelocity":
                return krpc.client.Types.createTuple(krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.FLOAT),krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.FLOAT),krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.FLOAT));
            case "GetTimeTillImpact":
                return krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.DOUBLE);
            case "HasTarget":
                return krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.BOOL);
            case "PlannedDirection":
                return krpc.client.Types.createTuple(krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.FLOAT),krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.FLOAT),krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.FLOAT));
            case "SetTarget":
                return null;
            case "get_AlwaysUpdate":
                return krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.BOOL);
            case "set_AlwaysUpdate":
                return null;
            case "get_GetVersion":
                return krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.STRING);
            case "get_GetVersionMajor":
                return krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.SINT32);
            case "get_GetVersionMinor":
                return krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.SINT32);
            case "get_GetVersionPatch":
                return krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.SINT32);
            case "get_ProgradeEntry":
                return krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.BOOL);
            case "set_ProgradeEntry":
                return null;
            case "get_RetrogradeEntry":
                return krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.BOOL);
            case "set_RetrogradeEntry":
                return null;
            }
            throw new IllegalArgumentException("Procedure '" + procedure +"' not found");
        }

        public static krpc.schema.KRPC.Type[] getParameterTypes(String procedure) {
            switch (procedure) {
            case "CorrectedDirection":
                return new krpc.schema.KRPC.Type[] {
                };
            case "GetEndTime":
                return new krpc.schema.KRPC.Type[] {
                };
            case "GetImpactLatLong":
                return new krpc.schema.KRPC.Type[] {
                };
            case "GetImpactPosition":
                return new krpc.schema.KRPC.Type[] {
                };
            case "GetImpactVelocity":
                return new krpc.schema.KRPC.Type[] {
                };
            case "GetTimeTillImpact":
                return new krpc.schema.KRPC.Type[] {
                };
            case "HasTarget":
                return new krpc.schema.KRPC.Type[] {
                };
            case "PlannedDirection":
                return new krpc.schema.KRPC.Type[] {
                };
            case "SetTarget":
                return new krpc.schema.KRPC.Type[] {
                    krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.DOUBLE),
                    krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.DOUBLE),
                    krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.DOUBLE)
                };
            case "get_AlwaysUpdate":
                return new krpc.schema.KRPC.Type[] {
                };
            case "set_AlwaysUpdate":
                return new krpc.schema.KRPC.Type[] {
                    krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.BOOL)
                };
            case "get_GetVersion":
                return new krpc.schema.KRPC.Type[] {
                };
            case "get_GetVersionMajor":
                return new krpc.schema.KRPC.Type[] {
                };
            case "get_GetVersionMinor":
                return new krpc.schema.KRPC.Type[] {
                };
            case "get_GetVersionPatch":
                return new krpc.schema.KRPC.Type[] {
                };
            case "get_ProgradeEntry":
                return new krpc.schema.KRPC.Type[] {
                };
            case "set_ProgradeEntry":
                return new krpc.schema.KRPC.Type[] {
                    krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.BOOL)
                };
            case "get_RetrogradeEntry":
                return new krpc.schema.KRPC.Type[] {
                };
            case "set_RetrogradeEntry":
                return new krpc.schema.KRPC.Type[] {
                    krpc.client.Types.createValue(krpc.schema.KRPC.Type.TypeCode.BOOL)
                };
            }
            throw new IllegalArgumentException("Procedure '" + procedure +"' not found");
        }
    }
}