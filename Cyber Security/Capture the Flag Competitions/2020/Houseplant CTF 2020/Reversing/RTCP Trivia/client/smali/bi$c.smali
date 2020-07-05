.class final Lbi$c;
.super Ldi;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ldi<",
        "Ljava/lang/Integer;",
        "Landroid/graphics/PorterDuffColorFilter;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x6

    invoke-direct {p0, v0}, Ldi;-><init>(I)V

    return-void
.end method

.method static a(ILandroid/graphics/PorterDuff$Mode;)I
    .locals 1

    const/16 v0, 0x1f

    add-int/2addr p0, v0

    mul-int/2addr v0, p0

    invoke-virtual {p1}, Landroid/graphics/PorterDuff$Mode;->hashCode()I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method
