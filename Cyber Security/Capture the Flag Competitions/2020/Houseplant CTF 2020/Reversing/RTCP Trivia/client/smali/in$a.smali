.class public final enum Lin$a;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lin;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lin$a;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lin$a;

.field public static final enum ON_ANY:Lin$a;

.field public static final enum ON_CREATE:Lin$a;

.field public static final enum ON_DESTROY:Lin$a;

.field public static final enum ON_PAUSE:Lin$a;

.field public static final enum ON_RESUME:Lin$a;

.field public static final enum ON_START:Lin$a;

.field public static final enum ON_STOP:Lin$a;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lin$a;

    const-string v1, "ON_CREATE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lin$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lin$a;->ON_CREATE:Lin$a;

    new-instance v0, Lin$a;

    const-string v1, "ON_START"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lin$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lin$a;->ON_START:Lin$a;

    new-instance v0, Lin$a;

    const-string v1, "ON_RESUME"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lin$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lin$a;->ON_RESUME:Lin$a;

    new-instance v0, Lin$a;

    const-string v1, "ON_PAUSE"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lin$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lin$a;->ON_PAUSE:Lin$a;

    new-instance v0, Lin$a;

    const-string v1, "ON_STOP"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lin$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lin$a;->ON_STOP:Lin$a;

    new-instance v0, Lin$a;

    const-string v1, "ON_DESTROY"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v7}, Lin$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lin$a;->ON_DESTROY:Lin$a;

    new-instance v0, Lin$a;

    const-string v1, "ON_ANY"

    const/4 v8, 0x6

    invoke-direct {v0, v1, v8}, Lin$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lin$a;->ON_ANY:Lin$a;

    const/4 v0, 0x7

    new-array v0, v0, [Lin$a;

    sget-object v1, Lin$a;->ON_CREATE:Lin$a;

    aput-object v1, v0, v2

    sget-object v1, Lin$a;->ON_START:Lin$a;

    aput-object v1, v0, v3

    sget-object v1, Lin$a;->ON_RESUME:Lin$a;

    aput-object v1, v0, v4

    sget-object v1, Lin$a;->ON_PAUSE:Lin$a;

    aput-object v1, v0, v5

    sget-object v1, Lin$a;->ON_STOP:Lin$a;

    aput-object v1, v0, v6

    sget-object v1, Lin$a;->ON_DESTROY:Lin$a;

    aput-object v1, v0, v7

    sget-object v1, Lin$a;->ON_ANY:Lin$a;

    aput-object v1, v0, v8

    sput-object v0, Lin$a;->$VALUES:[Lin$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lin$a;
    .locals 1

    const-class v0, Lin$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lin$a;

    return-object p0
.end method

.method public static values()[Lin$a;
    .locals 1

    sget-object v0, Lin$a;->$VALUES:[Lin$a;

    invoke-virtual {v0}, [Lin$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lin$a;

    return-object v0
.end method
