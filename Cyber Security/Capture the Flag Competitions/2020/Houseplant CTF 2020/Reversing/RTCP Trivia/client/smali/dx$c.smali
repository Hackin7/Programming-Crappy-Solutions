.class public final enum Ldx$c;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ldx$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Ldx$c;

.field public static final enum b:Ldx$c;

.field public static final enum c:Ldx$c;

.field public static final enum d:Ldx$c;

.field public static final enum e:Ldx$c;

.field public static final enum f:Ldx$c;

.field public static final enum g:Ldx$c;

.field public static final enum h:Ldx$c;

.field public static final enum i:Ldx$c;

.field private static final synthetic j:[Ldx$c;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Ldx$c;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ldx$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldx$c;->a:Ldx$c;

    new-instance v0, Ldx$c;

    const-string v1, "LEFT"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Ldx$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldx$c;->b:Ldx$c;

    new-instance v0, Ldx$c;

    const-string v1, "TOP"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Ldx$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldx$c;->c:Ldx$c;

    new-instance v0, Ldx$c;

    const-string v1, "RIGHT"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Ldx$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldx$c;->d:Ldx$c;

    new-instance v0, Ldx$c;

    const-string v1, "BOTTOM"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Ldx$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldx$c;->e:Ldx$c;

    new-instance v0, Ldx$c;

    const-string v1, "BASELINE"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v7}, Ldx$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldx$c;->f:Ldx$c;

    new-instance v0, Ldx$c;

    const-string v1, "CENTER"

    const/4 v8, 0x6

    invoke-direct {v0, v1, v8}, Ldx$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldx$c;->g:Ldx$c;

    new-instance v0, Ldx$c;

    const-string v1, "CENTER_X"

    const/4 v9, 0x7

    invoke-direct {v0, v1, v9}, Ldx$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldx$c;->h:Ldx$c;

    new-instance v0, Ldx$c;

    const-string v1, "CENTER_Y"

    const/16 v10, 0x8

    invoke-direct {v0, v1, v10}, Ldx$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldx$c;->i:Ldx$c;

    const/16 v0, 0x9

    new-array v0, v0, [Ldx$c;

    sget-object v1, Ldx$c;->a:Ldx$c;

    aput-object v1, v0, v2

    sget-object v1, Ldx$c;->b:Ldx$c;

    aput-object v1, v0, v3

    sget-object v1, Ldx$c;->c:Ldx$c;

    aput-object v1, v0, v4

    sget-object v1, Ldx$c;->d:Ldx$c;

    aput-object v1, v0, v5

    sget-object v1, Ldx$c;->e:Ldx$c;

    aput-object v1, v0, v6

    sget-object v1, Ldx$c;->f:Ldx$c;

    aput-object v1, v0, v7

    sget-object v1, Ldx$c;->g:Ldx$c;

    aput-object v1, v0, v8

    sget-object v1, Ldx$c;->h:Ldx$c;

    aput-object v1, v0, v9

    sget-object v1, Ldx$c;->i:Ldx$c;

    aput-object v1, v0, v10

    sput-object v0, Ldx$c;->j:[Ldx$c;

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

.method public static valueOf(Ljava/lang/String;)Ldx$c;
    .locals 1

    const-class v0, Ldx$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ldx$c;

    return-object p0
.end method

.method public static values()[Ldx$c;
    .locals 1

    sget-object v0, Ldx$c;->j:[Ldx$c;

    invoke-virtual {v0}, [Ldx$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ldx$c;

    return-object v0
.end method
